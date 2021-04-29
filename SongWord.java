public class SongWord
{
  public int findCount(String[][]songArray, String word)
  {
    int count = 0;
    for(String[] arr: songArray) { 
      for(String song: arr){
        if(song.indexOf(word) >= 0) {
          count++;
        }
      }
    }

    return count;
  }
}