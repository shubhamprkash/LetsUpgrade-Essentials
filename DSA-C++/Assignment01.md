# LetsUpgrade_day1_project
Time Complexity (Assignment)

## 1.Find the time complexity of
    
    a=1;
    b=1;
    while(b<=n)
    {
        a=a+1;
        b=a+b;
        cout<<"hello";
    }

### let n=10
### a=1 b=3
### a=2 b=6
### a=3 b= 10
### a=4 b=10
### so b= 1+2+3+4=10
### 1+2+3+…+k=n
### k(k+1)/2=n
### k^2=n
### k=sqrt(n)
### T(n)=sqrt(n)
### So 
## T(n)=O(sqrt(n))

##

## 2.Find the time complexity of
    
    for(i=n;i>=1;i=i/3)

    {
        cout<<"hello";
    }


### Let n = 81
### As i/3 so 81/3=27
### So the series be
### 81 27 9 3 1
### The loop get executed and “hello” will going to print for 5 times but time complexity will measure for only 4 times.
### 81=34 ;
### 4= log 3 81
### K = log 3 n
## T(n) = O(log 3  n) or T(n) = O(log  n)

