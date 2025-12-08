fruit_dict = {
    "apple": 150,
    "banana": 60,
    "grapes": 100,
    "guava": 50
}
fruit_to_check = input("Which fruit are you looking for? ").lower()

if(fruit_to_check in fruit_dict):
    print("This is available")
else:
    print("This is not available")