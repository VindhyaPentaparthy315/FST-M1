X=input("Enter your input :")
Y=input("Enter your input :")
if X == Y:
    print("It's a tie!")
elif X == 'rock':
    if Y == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif X == 'scissors':
    if Y == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif X == 'paper':
    if Y == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Please provide a valid input.")