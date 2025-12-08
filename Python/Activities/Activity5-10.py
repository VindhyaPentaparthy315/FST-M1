# num=int(input("enter a number"))
# for i in range(1,11):
#     result=num*i
#     print(num, ' x ', i, ' = ',result )

# Activity6    
# for i in range(10):
#     print(str(i) * i)
# Activity7
# numbers = input("Enter a list of values:")
# sum = 0
# for number in numbers:
#   sum += int(number)
# print(sum)

# Activity8

# List = [24, 67, 78, 98, 10]
# print("Original list is ", List)

# if (List[0] == List[-1]):
#     print(True)
# else:
#     print(False)

# Activity9

# listOne = [10, 20, 23, 11, 17]
# listTwo = [13, 43, 24, 36, 12]
# print("First List ", listOne)
# print("Second List ", listTwo)

# thirdList = []

# for num in listOne:
#     if (num % 2 != 0):
#         thirdList.append(num)
        
# for num in listTwo:
#     if (num % 2 == 0):
#         thirdList.append(num)

# print("result List is:")
# print(thirdList)

# Activity10

tuple = int(input("Enter a tuple"))
print("Original list is ", tuple)
print("Numbers divisible by 5 are: ")
for num in tuple:
    if (num % 5 == 0):
        print(num)