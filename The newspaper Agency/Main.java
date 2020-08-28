#include<iostream>
using namespace std;
int main()
{
  int w,x,y,temp,net_profit;
  cin>>w>>x>>y;
  temp = (w*x)-(w*y);
  net_profit = temp-100;
  cout<<net_profit;
}