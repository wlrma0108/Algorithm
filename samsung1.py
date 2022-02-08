import sys
input= lambda: sys.stdin.readline().rstrip()
n=int(input())
a=[]
for _ in range(n):
    name,kor,math,eng=imput().split()
    a.append([name,int(kor),int(math),int(eng)])

a.srot(key=labda x:(-x[1],x[2],x[3],x[0]))

for x in a:
    print(x[0])