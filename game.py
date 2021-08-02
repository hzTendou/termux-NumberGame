import random 
loop = 1
while loop == 1: 
number = random.randint(1, 10)

player_name = input("Merhaba adın nedir?\n")

number_of_guesses = 0

print('Tamam! '+ player_name+ ' 1 ile 10 arasında bir sayı tahmin ediyorum: \n ')

while number_of_guesses < 5:

    guess = int(input())

    number_of_guesses += 1

    if guess < number:

        print('Tahminin çok düşük')

    if guess > number:

        print('Tahminin çok yüksek')

    if guess == number:

        break

if guess == number:

    print('içindeki sayıyı tahmin ettin ' + str(number_of_guesses) + ' deneme!')

else:

    print('Sayıyı tahmin edemedin, sayı ' + str(number))
