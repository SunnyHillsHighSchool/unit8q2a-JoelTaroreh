class Main {
  public static void main(String[] args) {
    String[][] songs = {{"We Are Champions", "You Shook Me All Night Long","We Found Love"},{"Bleeding Love", "Stairway to Heaven", "Won't Get Fooled Again"},{"I'd Do Anything for Love", "Stupid Crazy Love","Love in This Club"},{"Since U Been Gone", "One More Time","Walk This Way"}};
     SongWord word = new SongWord();
    System.out.println("The number of songs that have the word Love is "+word.findCount(songs,"Love"));
  }
}
//output should be
//The number of songs that have the word Love is 5.