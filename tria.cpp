#include<bits/stdc++.h>
using namespace std;
vector<float> solve(float v[])
{
    vector<float>res;
    float all3=v[0]+v[1]+v[2];
    res.push_back(all3-v[1]*2);
    res.push_back(all3-v[2]*2);
    res.push_back(all3-v[0]*2);
    return res;
}
void findvertex(float xmid[],float ymid[])
{
    vector<float>v1=solve(xmid);
    vector<float>v2=solve(ymid);
    vector< pair<float,float> >v;
    v.push_back(make_pair(v1[0],v2[0]));
    v.push_back(make_pair(v1[1],v2[1]));
    v.push_back(make_pair(v1[2],v2[2]));
    sort(v.begin(),v.end());
    for(int i=0;i<3;i++)
    {
        cout<<fixed<<setprecision(4)<<v[i].first<<" "<<v[i].second<<"\n";
    }
}
int main()
{
    float xmid[3];
    float ymid[3];
    cin>>xmid[0]>>ymid[0];
    cin>>xmid[1]>>ymid[1];
    cin>>xmid[2]>>ymid[2];
    findvertex(xmid,ymid);
    return 0;
}
