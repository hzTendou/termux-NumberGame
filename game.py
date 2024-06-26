import random 
loop = 1
while loop == 1: 
   number = random.randint(1, 10)
   player_name = input("Enter a name\n")
   number_of_guesses = 0
   print('Okay! '+ player_name+ ' let's guess a number around 1 and 20: \n ')
   while True:
       guess = int(input())
       number_of_guesses += 1
       if number_of_uesses == 6:
          print('You're reached test limit, try again!')
          break
       if guess < number:
          print('Guess is lower than number')
       if guess > number:
          print('Guess is higher than number')
       if guess == number:
          print('You're found true number with ' + str(number_of_guesses) + ' trys!')
   break
