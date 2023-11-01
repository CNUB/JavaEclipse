#include <stdio.h>
#include <stdlib.h>

// 다항식 리스트의 노드 구조를 구조체로 정의
float coef;
typedef struct ListNode {
	float coef;
	int expo;	// 지수
	struct ListNode* link;
} ListNode;

// 다항식 리스트의 head 노드를 구조체로 정의
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
// 다항식 리스트에 노드를 추가
// 새로운 항을 추가할 때, 지수를 기준으로 내림차순으로 정렬하여 저장한다.
void appendTerm(ListHead* L, float coef, int expo) {
	ListNode* newNode;
	// p는 다항식 리스트를 순회하기 위한 포인터
	// prev는 p의 이전 노드를 가리키는 포인터
	ListNode* p, * prev;	

	newNode = (ListNode*)malloc(sizeof(ListNode));
	newNode->coef = coef;
	newNode->expo = expo;
	newNode->link = NULL;

	p = L->head;  // 리스트의 시작 지점부터 탐색을 시작
	prev = NULL;  // 이전 노드를 가리키는 포인터 초기화

	// 만약 다항식 리스트가 비어있거나 새로운 항의 지수가 가장 큰 경우 
	if (L->head == NULL || L->head->expo < expo) {
		// 새로운 노드를 리스트의 맨 앞에 추가하고, 새로운 노드의 링크를 현재 헤드 노드로 설정
		newNode->link = L->head;
		L->head = newNode;
		return;
	}

	// 그렇지 않을 경우 리스트를 순회하며 적절한 위치에 노드 삽입
	while (p != NULL && p->expo > expo) {
		// prev와 p 사이에 새로운 노드를 추가
		prev = p;
		p = p->link;
	}

	// prev와 p 사이에 newNode를 추가
	prev->link = newNode;
	newNode->link = p;
}
void addPoly(ListHead* A, ListHead* B, ListHead* C) {
	ListNode* pA = A->head;
	ListNode* pB = B->head;
	float sum;

	// 두 다항식에 노드가 있는 동안 반복 수행
	while (pA && pB) {
		// 다항식 A의 지수가 다항식 B의 지수와 같은 경우
		if (pA->expo == pB->expo) {
			sum = pA->coef + pB->coef;	// 다항식 A의 현재 노드의 계수와 다항식 B의 현재 노드의 계수를 더하여 sum을 구한다
			appendTerm(C, sum, pA->expo);
			pA = pA->link;
			pB = pB->link;
		}
		// 다항식 A의 차수가 다항식 B의 지수보다 큰 경우
		else if (pA->expo > pB->expo) {
			appendTerm(C, pA->coef, pA->expo);
			pA = pA->link;
		}
		// 다항식 A의 지수가 다항식 B의 지수보다 작은 경우
		else {
			appendTerm(C, pB->coef, pB->expo);
			pB = pB->link;
		}
	}
	// 다항식 A에 남아있는 노드 복사
	for (; pA != NULL; pA = pA->link) 
		appendTerm(C, pA->coef, pA->expo);

	// 다항식 B에 남아있는 노드 복사
	for (; pB != NULL; pB = pB->link)
		appendTerm(C, pB->coef, pB->expo);
}

// 다항식 리스트를 출력하는 연산
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

	//공백 다항식 리스트 A,B,C 생성
	A = createLinkedList();
	B = createLinkedList();
	C = createLinkedList();

	appendTerm(A, 3, 2); // 다항식 리스트 A에 3x^2 노드 추가
	appendTerm(A, 4, 3); // 다항식 리스트 A에 4x^3 노드 추가
	appendTerm(A, 5, 1); // 다항식 리스트 A에 5x^1 노드 추가

	printf("\n A(x) = ");
	printPoly(A);	// 다항식 리스트 A 출력

	appendTerm(B, 2, 1); // 다항식 리스트 B에 2x^1 노드 추가
	appendTerm(B, 3, 4); // 다항식 리스트 B에 3x^4 노드 추가
	appendTerm(B, 1, 3); // 다항식 리스트 B에 1x^3 노드 추가
	appendTerm(B, 1, 0); // 다항식 리스트 B에 1x^0 노드 추가

	printf("\n B(x) = ");
	printPoly(B);	// 다항식 리스트 B 출력


	addPoly(A, B, C);	// 다항식 리스트 B 출력
	printf("\n C(x) = ");
	printPoly(C);

	getchar();

    return 0;
}