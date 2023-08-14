let jsq_questions = [
	{
		"id": 1,
		"question": "What is the time complexity of the following code:",
		"code": "int j = 0;\nfor(i = 0; i < n; ++i) {\n    while(j < n && arr[i] < arr[j]) {\n        j++;\n    }\n}",
		"options": {
			"a": "O((n^2)*(log(n)))",
			"b": "Can't say. Depends on the value of arr.",
			"c": "O(n)",
			"d": "O(n*log(n))"
		},
		"answer": "c"
	},
	{
		"id": 2,
		"question": "What is the time, space complexity of the following code :",
		"code": "int a = 0, b = 0;    \nfor (i = 0; i < N; i++) {\n    a = a + rand();  \n}\nfor (j = 0; j < M; j++) {\n    b = b + rand();\n}",
		"options": {
			"a": "O(N * M) time, O(1) space",
			"b": "O(N * M) time, O(N * M) space",
			"c": "O(N + M) time, O(N + M) space",
			"d": "O(N + M) time, O(1) space"
		},
		"answer": "d"
	},
	{
		"id": 3,
		"question": "What is the time, space complexity of the following code:",
		"code": "int a = 0, b = 0;\n\nfor (i = 0; i < N; i++) {\n    for (j = 0; j < N; j++) {\n        a = a + j;\n    }\n}\n\nfor (k = 0; k < N; k++) {\n    b = b + k;\n}",
		"options": {
			"a": "O(N * N) time, O(N) space",
			"b": "O(N * N * N) time, O(1) space",
			"c": "O(N) time, O(N) space",
			"d": "O(N * N) time, O(1) space"
		},
		"answer": "d"
	},
	{
		"id": 4,
		"question": "What is the time complexity of the following code:",
		"code": "int a = 0;\nfor (i = 0; i < N; i++) {\n    for (j = N; j > i; j--) {\n        a = a + i + j;\n    }\n}",
		"options": {
			"a": "O(N*N)",
			"b": "O(N * Sqrt(N))",
			"c": "O(N)",
			"d": "O(N*log(N))"
		},
		"answer": "a"
	},
	{
		"id": 5,
		"question": "What does it mean when we say that an algorithm X is asymptotically more efficient than Y?",
		"options": {
			"a": "X will always be a better choice for small inputs",
			"b": "Y will always be a better choice for small inputs",
			"c": "X will always be a better choice for large inputs",
			"d": "X will always be a better choice for all inputs"
		},
		"answer": "c"
	}
];