#include <stdio.h>
#include <stdlib.h>

// ���׽� ����Ʈ�� ��� ������ ����ü�� ����
float coef;
typedef struct ListNode {
	float coef;
	int expo;	// ����
	struct ListNode* link;
} ListNode;

// ���׽� ����Ʈ�� head ��带 ����ü�� ����
typedef struct ListHead {
	ListNode* head;
} ListHead;

ListHead* createLinkedList(void);
void appendTerm(ListHead* L, float coef, int expo);
void addPoly(ListHead* A, ListHead* B, ListHead* C);
void printPoly(ListHead* L);
//---------------------------------------------------------------
ListHead* createLinkedList(void) {
	ListHead* L;
	L = (ListHead *)malloc(sizeof(ListHead));
	L->head = NULL;
	return L;
}
// ���׽� ����Ʈ�� ��带 �߰�
// ���ο� ���� �߰��� ��, ������ �������� ������������ �����Ͽ� �����Ѵ�.
void appendTerm(ListHead* L, float coef, int expo) {
	ListNode* newNode;
	// p�� ���׽� ����Ʈ�� ��ȸ�ϱ� ���� ������
	// prev�� p�� ���� ��带 ����Ű�� ������
	ListNode* p, * prev;	

	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->coef = coef;
	newNode->expo = expo;
	newNode->link = NULL;

	p = L->head;  // ����Ʈ�� ���� �������� Ž���� ����
	prev = NULL;  // ���� ��带 ����Ű�� ������ �ʱ�ȭ

	// ���� ���׽� ����Ʈ�� ����ְų� ���ο� ���� ������ ���� ū ��� 
	if (L->head == NULL || L->head->expo < expo) {
		// ���ο� ��带 ����Ʈ�� �� �տ� �߰��ϰ�, ���ο� ����� ��ũ�� ���� ��� ���� ����
		newNode->link = L->head;
		L->head = newNode;
		return;
	}

	// �׷��� ���� ��� ����Ʈ�� ��ȸ�ϸ� ������ ��ġ�� ��� ����
	while (p != NULL && p->expo > expo) {
		// prev�� p ���̿� ���ο� ��带 �߰�
		prev = p;
		p = p->link;
	}

	// prev�� p ���̿� newNode�� �߰�
	prev->link = newNode;
	newNode->link = p;
}
void addPoly(ListHead* A, ListHead* B, ListHead* C) {
	ListNode* pA = A->head;
	ListNode* pB = B->head;
	float sum;

	// �� ���׽Ŀ� ��尡 �ִ� ���� �ݺ� ����
	while (pA && pB) {
		// ���׽� A�� ������ ���׽� B�� ������ ���� ���
		if (pA->expo == pB->expo) {
			sum = pA->coef + pB->coef;	// ���׽� A�� ���� ����� ����� ���׽� B�� ���� ����� ����� ���Ͽ� sum�� ���Ѵ�
			appendTerm(C, sum, pA->expo);
			pA = pA->link;
			pB = pB->link;
		}
		// ���׽� A�� ������ ���׽� B�� �������� ū ���
		else if (pA->expo > pB->expo) {
			appendTerm(C, pA->coef, pA->expo);
			pA = pA->link;
		}
		// ���׽� A�� ������ ���׽� B�� �������� ���� ���
		else {
			appendTerm(C, pB->coef, pB->expo);
			pB = pB->link;
		}
	}
	// ���׽� A�� �����ִ� ��� ����
	for (; pA != NULL; pA = pA->link) 
		appendTerm(C, pA->coef, pA->expo);

	// ���׽� B�� �����ִ� ��� ����
	for (; pB != NULL; pB = pB->link)
		appendTerm(C, pB->coef, pB->expo);
}

// ���׽� ����Ʈ�� ����ϴ� ����
void printPoly(ListHead* L) {
	ListNode* p = L->head;
	for (; p; p = p->link) {
		printf("%3.0fx^%d", p->coef, p->expo);
		if (p->link != NULL) printf(" +");
	}
}
//-----------------------------------------------------------------------------------------
int main() {
	ListHead *A, *B, *C;

	//���� ���׽� ����Ʈ A,B,C ����
	A = createLinkedList();
	B = createLinkedList();
	C = createLinkedList();

	appendTerm(A, 3, 2); // ���׽� ����Ʈ A�� 3x^2 ��� �߰�
	appendTerm(A, 4, 3); // ���׽� ����Ʈ A�� 4x^3 ��� �߰�
	appendTerm(A, 5, 1); // ���׽� ����Ʈ A�� 5x^1 ��� �߰�

	printf("\n A(x) = ");
	printPoly(A);	// ���׽� ����Ʈ A ���

	appendTerm(B, 2, 1); // ���׽� ����Ʈ B�� 2x^1 ��� �߰�
	appendTerm(B, 3, 4); // ���׽� ����Ʈ B�� 3x^4 ��� �߰�
	appendTerm(B, 1, 3); // ���׽� ����Ʈ B�� 1x^3 ��� �߰�
	appendTerm(B, 1, 0); // ���׽� ����Ʈ B�� 1x^0 ��� �߰�

	printf("\n B(x) = ");
	printPoly(B);	// ���׽� ����Ʈ B ���


	addPoly(A, B, C);	// ���׽� ����Ʈ B ���
	printf("\n C(x) = ");
	printPoly(C);

	getchar();

    return 0;
}