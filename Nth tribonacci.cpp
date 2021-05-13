class Solution {
public:
    int tribonacci(int N) {
        if(N == 0)return 0;
		if(N == 2 || N == 1) return 1;
        int fib[N+1];
		fib[0] = 0;
		fib[1] = 1;
		fib[2] = 1;
        for(int i=3;i<N+1;i++){
            fib[i] = fib[i-1] + fib[i -2] + fib[i-3];
        }
        return fib[N];
    }
};
