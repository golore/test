import java.util.ArrayList;
public class DotComTest{

public static void main(String[] args) {
	int numofguess=0;

	GameHelper helper=new GameHelper();
	DotCom thedotcom=new DotCom();
    ArrayList<String> comIndex=new ArrayList<String>();

	int randromNum=(int)(Math.random()*5);
    comIndex.add(Integer.toString(randromNum));
    comIndex.add(Integer.toString(randromNum+1));   
    comIndex.add(Integer.toString(randromNum+2));

    thedotcom.setLocationCells(comIndex);

	boolean isAction=true;

	while(isAction){
		String guessnum=helper.getUserInput("Enter a number:");
		String result=thedotcom.checkYourself(guessnum);
		numofguess++;

		if(result=="kill"){
			isAction=false;
			System.out.println("U took "+numofguess+" guesses!");
		}
	}
}
}