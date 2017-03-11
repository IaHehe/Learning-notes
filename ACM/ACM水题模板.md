# ACM水题模板



任意进制转换

```c++
//进制转换
#include<cstdio>
#include<stack>
#include<iostream>

using namespace std;
stack<int> sk;
char a[10]={'A','B','C','D','E','F','G'};
int main()
{
    int n,r,t,flag;
    while(~scanf("%d%d",&n,&r)){ //数字n，转化为r进制
        flag=1;
        if(n<0) {
            n=-n,flag=0;
        }
        while(n){
            sk.push(n%r);
            n/=r;
        }
        if(!flag) cout<<"-";
        while(!sk.empty()){
            t=sk.top();
            if(t>9) cout<<a[t-10];
            else
                cout<<t;
            sk.pop();
        }
        cout<<endl;
    }
    return 0;
}
```



