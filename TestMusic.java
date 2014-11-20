/*
 * Josh Pollmann
 * 11/20/14
 * This class contains the searching methods for the myMusic array
 */
public class TestMusic {

	public static void printMusic(Music[] music){
		for(int i = 0; i < music.length; i++){
			System.out.println(music[i].toString());
		}
	}
	
	public static void searchTitle(Music[] music, String title){
		System.out.println("Search - Singer - " + title);
		boolean isInLibrary = false;
		int e = 0;
		for(int i = 0; i < music.length; i++){
			if(music[i].getMyTitle().equalsIgnoreCase(title)){
				isInLibrary = true;
				e = i;
			}
		}
		if(isInLibrary){
			System.out.println("We found " + title + " in the library:");
			System.out.println(music[e].toString());
		}else{
			System.out.println(title + " is not in the library");
		}
	}
	
	public static void searchYear(Music[] music, int year){
		System.out.println("Search - Year - " + year);
		Music[] discsByYear = new Music[10];
		int e = 0;
		for(int i = 0; i < music.length; i++){
			if(music[i].getMyYear() == year){
				discsByYear[e] = music[i];
				e++;
			}
		}
		System.out.println("Find Results:");
		if(e == 0){
			System.out.println("There are no listings for " + year);
		}else{
			for(int i = 0; i < discsByYear.length; i++){
				if(discsByYear[i] == null){
					i++;
				}else{
					System.out.println(discsByYear[i].toString());
				}
			}
		}
	}
	
	public static void searchSinger(Music[] music, String singer){
		System.out.println("Search - Singer - " + singer);
		Music[] discsBySinger = new Music[10];
		int e = 0;
		for(int i = 0; i < music.length; i++){
			if(music[i].getMySinger().equalsIgnoreCase(singer)){
				discsBySinger[e] = music[i];
				e++;
			}
		}
		System.out.println("Find Results:");
		if(e == 0){
			System.out.println("There are no listings for " + singer);
		}else{
			for(int i = 0; i < discsBySinger.length; i++){
				if(discsBySinger[i] == null){
					i++;
				}else{
					System.out.println(discsBySinger[i].toString());
				}
			}
		}
	}
	
	public static void main(String[] args){
		Music[] myMusic = new Music[10];
		
		myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
		myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
		myMusic[2] = new Music("What If It's You", 1995, "Reba McEntire");
		myMusic[3] = new Music("Misunderstood", 2001, "Pink");
		myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
		myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
		myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
		myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
		myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
		myMusic[9] = new Music("White Flag", 2004, "Dido");
		
		System.out.println("Music Library:");
		System.out.println("--------------");
		printMusic(myMusic);
		
		System.out.println();
		searchTitle(myMusic, "Let Go");
		System.out.println();
		searchTitle(myMusic, "Some Day");
		System.out.println();
		searchYear(myMusic, 2001);
		System.out.println();
		searchYear(myMusic, 2003);
		System.out.println();
		searchSinger(myMusic, "Avril Lavigne");
		System.out.println();
		searchSinger(myMusic, "Tony Curtis");

	}
}
