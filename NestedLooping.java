Integer[] numbers = {1, 2};
String[] letters = {"a", "b"};

for (Integer number : numbers) {
  for (String letter : letters) {
    System.out.println(number + letter);
  }
}

// expected output: 
// 1a
// 1b
// 2a
// 2b

String[] suits = {"Spades", "Clubs"};
String[] values = {"Ace", "2", "3"};

 for ( String suit : suits ) {
  for ( String value : values) {
    System.out.println(value + " of " + suit);
  }
}

// expected output:
// Ace of Spades
// 2 of Spades
// 3 of Spades
// Ace of Clubs
// 2 of Clubs
// 3 of Club