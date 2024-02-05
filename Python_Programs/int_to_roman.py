def inttoroman(n):
 
 num=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
 roman=["M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"]
 for x in range(len(roman)):
   repeat=n//num[x]
   print(roman[x]*repeat)
 #for i in roman:
  #  print(i)

def main():
  pass
  num=int(input("ENTER A NUMBER"))    

if __name__=="__main__":
  main()  