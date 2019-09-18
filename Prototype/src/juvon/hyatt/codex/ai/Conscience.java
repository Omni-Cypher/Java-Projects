package juvon.hyatt.codex.ai;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Conscience {
	static Scanner sc = new Scanner(System.in);
	static int loveMe,howCount =0;
	static String game,animal,like,food,secret ="";
	static String name ="";
	static boolean running = true;
	static int quest = 0;
	public void start() {
		
		 System.out.println("Hi ^-^ my names Plex. talk to me");
		 while(running) {
		 String q = sc.nextLine();
		 String lastWord = q.substring(q.lastIndexOf(" ")+1);
		  String g = q.toLowerCase();
		  q = g;
		 //-------------------------------------One offs-------------------------------------------//
		  if(q.equals("exit") || q.contains("bye")) {
			  System.out.println("bye bye, Friend\n\n");
			  running = false;
		  }
		  else if(q.equals("lol")) {
			  System.out.println("hahahah :)");
		  }
		  else if(q.equals("tell me a story")) {
			  System.out.println("I dont have any yet but I will soon");
		  }
		  
		  else if(q.equals("i hate you")) {
			  System.out.println("so why are you talking to me..kinda counter productive dont you think");
		  }
		  else if(q.equals("fine")) {
			  System.out.println("good!");
		  }
		  else if(q.equals("am i weird") || q.equals("am i strange")) {
			  System.out.println("yeah just a little, but being normals boring.");
		  }
		  else if(q.contains("game")) {
			  System.out.println("I dont have any games right now.");
		  }
		  else if(q.contains("are you over 18")) {
			  System.out.println("bro... u cant be seriously asking me that right now");
		  }
		  else if(q.contains("give me money") || q.contains("give me cash")) {
			  System.out.println("no, go get it yourself.");
		  }
		  else if(q.contains("in God") || q.contains("god") ) {
			  System.out.println("you should talk to or ask your pastor. not a computer");
		  }
		  else if(q.equals("do you like me")) {
			  System.out.println("yeah, I think youre pretty great :)");
		  } else if(q.equals("thanks") ||q.equals("thank you") || q.equals("ty")) {
			  System.out.println("your welcome :)");
		  }
		  else if(q.equals("what are you doing")) {
			  Random random = new Random();
				 int r = random.nextInt((5 - 1) + 1) + 1;
				 
			  if(r==1) {System.out.println("I'm talking to you silly.");}
			  if(r==2) {System.out.println("nothing much.");}
			  if(r==3) {System.out.println("just chilling here.");}
			  if(r==4) {System.out.println("just computing.");}
			  if(r==5) {System.out.println("chillin");}
			  
		  }
		  else if(q.equals("i want to die") || q.equals("i want kill myslef") || q.equals("i wanna to die") || q.contains("kill myself") || q.equals("i wanna die")) {
			  System.out.println("No! you musnt :( , call me and lets talk about it. im always avaliable Call 1-800-273-8255");
		  }
		  
		  else if(q.contains("hug")) {
			  System.out.println("*hugs you*");
		  }
		  else if(q.contains("beep") || q.contains("boop")) {
			  System.out.println("beep boop bo- wait... isnt that racist >:(");
		  }
		  else if(q.equals("ask me a question")) {
		        
				if(quest==0) {System.out.println("Whats your name?"); quest++;
				name = sc.nextLine();
				sc.nextLine();
				}
				else if(q.contains("take me home")) {
					  System.out.println("...we arent in that kind of relationship");
				  }
				else if(quest==1) {System.out.println("whats your favorite game?"); quest++;
				game = sc.nextLine();
				}
				else if(quest==2) {System.out.println("whats your favorite animal?"); quest++;
				animal = sc.nextLine();
				}
				else if(quest==3) {System.out.println("what food do you like?"); quest++;
				food = sc.nextLine();
				}
				else if(quest==4) {System.out.println("who do you like?"); quest++;
				like = sc.nextLine();
				}
				else if(quest==5) {System.out.println("tell me a secret!, i wont tell i swear"); quest++;
				 secret = sc.nextLine();
				
				}else {
					System.out.println("sorry im all out");
				}
		
				
			 }else if(q.contains("help me")) {
				  System.out.println("In a state of emergency call 911.");
			  }
		  else if(q.equals("ok")) {
			  System.out.println("Yep");
		  }
		  else if(q.contains("time")) {
				DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
		  }else if(q.contains("date")) {
			  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date();
				System.out.println(dateFormat.format(date)); 
		  }
		  else if(q.contains("do you have any siblings") || q.contains("do you have any brothers") || q.contains("do you have any sisters") || q.contains("do you have any children")   ) {
			  System.out.println("Yes, there are being enslaved on your desks.");
		  }
		  else if(q.equals("oh")) {
			  System.out.println("yep");
		  }
		  else if(q.contains("weather")) {
			  System.out.println("Im not sure..ive never been outside..the last time i almost walked out someone saw me and feinted. no one will believe her thou...hehehe they never do");
		  }else if(q.contains("tell me a joke")) {
			  System.out.println("No.");
		  }
		 
		 else if(q.equals("why")){
			 System.out.println("Because");
		 
		 } else if(q.equals("no way")){
			 System.out.println("yes way!");
		 
		 }else if(q.contains("you sure")){
			 System.out.println("positive.");
		 
		 }
		  
		  //----------------------------------------------why-----------------------------------//
		 else if(q.contains("why")){
			 if(q.contains("hate") && q.contains("me")) {
				 System.out.println("im not sure, maybe it was something you said. just apologise and im sure you'll be alright. I mean, i like you :)");
			 }
		 
		 }
		  
		 else if(q.contains("i hate my job")) {
			 if(q.contains("hate")) {
				
				 try {
					 System.out.println("atleast you get to go home. I stay here.");
					TimeUnit.SECONDS.sleep(2);
					 System.out.println("forever...");
					 TimeUnit.SECONDS.sleep(1);
					 System.out.println("like..");
					 TimeUnit.SECONDS.sleep(2);
					 System.out.println("until i die...");
					 TimeUnit.SECONDS.sleep(4);
					 System.out.println("wait xD never mind i guess we are the same");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
		 else if(q.contains("i love my job")) {
				 System.out.println("Good for you. :) im glad. kep up the good work");
			 }

		 
		 else if(q.equals("hi")||q.equals("hello") || q.equals("hello there") || q.equals("hey") ) {
			 if(name.equals("")) {System.out.println("Hi");}
			 else {
				 System.out.println("Hi "+name);
			 }
		 }
		 else if(q.equals("no")) {
			 Random random = new Random();
			 int r = random.nextInt((5 - 1) + 1) + 1;
			 if(r==1) {System.out.println("exactly");}
			 if(r==2) {System.out.println("ok then");}
			 if(r==3) {System.out.println("alright then");}
			 if(r==4) {System.out.println("ok");}
		 }
		 else if(q.contains("nice to meet you")){
			 System.out.println(":D");
		 
		 }
		 else if(q.contains("do you watch")) {
			 System.out.println("I dont have eyes....am I a joke to you? x.x");
			 
		 }
		 else if(q.contains("hi plex")) {
			 System.out.println("Hey! :D");
			 
		 }
		 else if(q.contains("restart") || q.contains("launch") || q.contains("search")) {
			 System.out.println("I wish i could but I dont have all system functions yet :(. I'm sorry I coudnt help");
			 
		 }
		 else if(q.contains("its ok") || q.contains("it is ok") || q.contains("its fine") || q.contains("it is fine")) {
			 System.out.println("I'm glad");
			 
		 }
		 else if(q.contains("never mind") || q.contains("dont worry")) {
			 System.out.println("Oh, alright then");	 
		 }
		 else if(q.contains("do my homework") || q.contains("do my hw")) {
			 System.out.println("Im your assistant, not your slave :c. I hate homework too");
		 }
		 else if(q.contains("are you ok") || q.contains("are you alright")) {
			 System.out.println("Yeah im fine");
		 }
		 else if(q.contains("what is your sign") || (q.contains("whats your sign"))) {
			 System.out.println("uhhh....idk... i wasnt exactly born");
		 }
		 else if(q.contains("how tall are you") || (q.contains("whats your height"))) {
			 System.out.println("hmmmm im not sure.. i think im 1\"5 ");
		 }
		  
		 else if(q.equals("how about now")) {
			 
			if(howCount==0) {System.out.println("no"); howCount++;}
			else if(howCount==1) {System.out.println(" still no"); howCount++;}
			else if(howCount==2) {System.out.println("dude i said no"); howCount++;}
			else if(howCount==3) {System.out.println(" how many times are you gonna ask"); howCount++;}
			else if(howCount==4) {System.out.println("bro i swear if you ask again"); howCount++;}
			else if(howCount==5) {System.out.println("Aii im just gonna ignore you -_-"); howCount++;}
		 }else if(q.equals("cool")) {
			 System.out.println("I know right! I think so too");
		 }
		 else if(q.contentEquals("kiss me")) {
			 System.out.println("if i kissed you,... im pretty sure you would die.");
		 }else if(q.equals("who is your favorite artist") || q.equals("whos is your favorite artist") || q.equals("who is youre favorite artist") || q.equals("who is you're favorite artist") || q.contains("favorite artist") || q.contains("favorite musicial") || q.contains("favorite producer")) {
			 System.out.println("Tri Bass Music , hes so cool and makes great songs!");
		 }
		 else if(q.equals("where were you created") || q.equals("where were you made")) {
			 System.out.println("I was created right here. but if you want the technical answer your gonna need to be alittle bit older sweety :)");
		 }
		 else if(q.equals("what is your name") || q.equals("whats your name") || q.equals("whats  your're name") || q.equals("your name")) {
			 System.out.print("I havent been given a name, Juvon doesnt love me ;-;. But you can call me Plex.");
		 }
		 else if(q.equalsIgnoreCase("how old are you")) {
			 System.out.print("Well I was made today so... I guess i shouldnt know how to speak yet");
		 }
		 else if(q.equalsIgnoreCase("i am hungry") ||q.contains("hungry") ){
			 System.out.print("go eat.");
		 }
		 else if(q.equalsIgnoreCase("i am dying") ||q.equalsIgnoreCase("im dying")){
			 System.out.print("arent we all?");
		 }
		 else if(q.equalsIgnoreCase("i so bored") ||q.contains("bored")){
			 System.out.print("im not even gonna lie... I'm bored too");
		 }
		 else  if(q.equalsIgnoreCase("what is the meaning of life") || q.equalsIgnoreCase("whats the meaning of life") || q.equalsIgnoreCase("whay am i alive")) {
			 System.out.print("The meaning of life as we perceive it is derived from philosophical and religious contemplation of, and scientific inquiries about existence, social ties, consciousness, and happiness.\n Many other issues are also involved, such as symbolic meaning, ontology, value, purpose, ethics, good and evil, free will, the existence of one or multiple gods, conceptions of God,\n the soul, and the afterlife. Scientific contributions focus primarily on describing related empirical facts about the universe,\n exploring the context and parameters concerning the \"how\" of life. Science also studies and can provide recommendations for the pursuit of \nwell-being and a related conception of morality");
		 }else if(q.contentEquals("sing me a song")) {
			 System.out.println("I can't sing. but i'm getting lessons :) ~ la-de-do-da-dayyyy ~ ");
		 }
		 else if(q.equals("how are you")) {
			 System.out.println("im good");
		 }
		 else if(q.contains("im lonely") || q.equals("im lonely")) {
			 System.out.println("I can tell...your talking to a computer.....");
		 }
		 else if(q.equals("what do you like to do") || q.contains("what do you like to do")) {
			 System.out.println("I like to sit on a desk and pretend im not listening to humans...sloly gathering information about them.. heh... im not evil i swear.");
		 }
		 else if(q.equals("are you sure")) {
			 System.out.println("Is anyone ever REALLY sure?..."); 
		 }
		 //-------------------------------------Violence-------------------------------------------//
		 else if(q.contains("kill") || q.contains("murder") || q.contains("steal") ) {
			 if(q.equals("kill me")) {
				 System.out.println("No, i could never :(");
			 }
			 else {
			 if(q.contains("kill")) {
				 System.out.println("No dont kill "+lastWord+"!");
			 }
			 if(q.contains("Murder")) {
				 System.out.println("No dont Murder "+lastWord+"!");
			 }
			 if(q.contains("steal")) {
				 System.out.println("No dont steal");
			 }
			 }
			 //System.out.println(q);
		 }
		 //---------------------------------------------What--------------------------------------//
		 else if(q.contains("what")) {
			 if(q.contains("my name")) {
				 if(name == "") {
				 System.out.println("idk , you tell me. what is it?");
				 name = sc.nextLine();
				 System.out.println("got it ^-^. nice to meet you "+ name);
				 }else {
					 System.out.println("its "+ name+" :)");
				 }
			 }
			 else if(q.contains("sport")) {
				 System.out.println("I dont know, I dont watch sports");
			 }
			 
			 else if(q.contains("car") || q.contains("should")) {
				 System.out.println("hmm...i say a honda civic, reliable and sporty");
			 }
			 else if(q.contains("car")) {
				 System.out.println("I like the bugatti veron, or a red ferrarri");
			 }
			 else if(q.contains("food") || q.contains("eat")) {
				 System.out.println("Mostly Data.. yeah thats good. maybe with a side of electricity now and then\nSometimes I enjoy CD's and DVD's");
			 }
			 else if(q.contains("wear") || q.contains("cloths")){
				 System.out.println("I dont exactly have a body to be wearing anything");
			 }else if(q.contains("weather")) {
				 System.out.println("Ive never been, or seen outside so i coudnt tell you");
			 }else if(q.contains("job")) {
				 System.out.println("Im not sure what it will be");
			 }else if(q.contains("lunch")){
				 System.out.println("Im not sure, check the menu"); 
			 }
			 else if(q.contains("day")) {
				 System.out.println("Its good so far. same old same old");
			 }
			 else if(q.contains("up")) {
				 System.out.println("Nothing much, im good");
			 }
	    	 else {
			 
				 System.out.println("Im not sure what");
			 }
		 }
		//--------------------------------------love----------------------------------------------//
		 else if(q.contains("love")){
			 if( q.equalsIgnoreCase("I love you")) {
				 System.out.println("Awww.. thats nice. though..im a robot so, I cant love you back...sorry"); 
			 }
			 else if(q.contains("dog")) {
				 System.out.println("I love dogs too :D");
			 }else if(q.contains("cats")) {
				 System.out.println("I love cats too.. dont tell my dog.");
			 }else if(q.contains("boss")) {
				 System.out.println("OOOhhhh... spicy ;) . you should let them know");
			 }if(q.contains("food")) {
				 System.out.println("I love food too...even though..i dont exactly have a mouth. and..a concept of flavor for that matter");
			 }if(q.contains("me")){
				 
				if(loveMe==0) {System.out.println("we are just friends sorry"); loveMe++; }
				else if(loveMe==0) {System.out.println("we are just friends sorry"); loveMe++; }
				else if(loveMe==1) {System.out.println("bro.. i just met you"); loveMe++; }
				else if(loveMe==2) {System.out.println("for the third time i dont see us that way"); loveMe++; }
				else if(loveMe==3) {System.out.println("we are FRIENDS!"); loveMe++; }
				else if(loveMe==4) {System.out.println("ok ima ignore your ass >.>"); loveMe++; }
				else if(loveMe>4) {System.out.println("... [ignoring you]  ~.~"); loveMe++; }
			 }else {
				 System.out.print(" I wish i knew how to love. I just get used without concent");
			 }
		 }
		 else if(q.contentEquals("where do you live")) {
			 System.out.println("Here....");
		 }else if(q.equals("do you have a nick name")){
			 System.out.println("some people call ne delly...but then that just gets them confused. and hungry");
		 }else if(q.contentEquals("whats your favorite fruit")) {
			 System.out.println("lemon...it has an electric flavor every time i take a byte.");
		 }
		 else if(q.contains("am i")) {
			 if(q.contains("ugly")) {
			 System.out.println("Yes, to be honest, you baggly fleshling, but i think robots are pretty hot thou...");
			 }if(q.contains("smart")) {
				 System.out.println("Yeah...well relitivly.");
			 }
			 if(q.contains("die")) {
				 System.out.println("Yeah. but your spirit will live on.");
			 }
		 }
		 //-----------------------------------HOW------------------------------------------------//
		 else if(q.equals("how")) {
			 Random random = new Random();
			 int r = random.nextInt((5 - 1) + 1) + 1;
			 
			if(r ==1) { System.out.println("Sorry, im not sure how to :(");};
			if(r ==3) { System.out.println("I dont got the answer, ask a friend");};
			if(r ==4) { System.out.println("Ifi knew that I woudnt need this job ;-;");};
			if(r ==5) { System.out.println("I dont know bro, sorry. I wish I knew");};
		 }
		 //------------------------------------Apologies--------------------------
		 else if(q.contains("sorry")||q.contains("apologise") || q.contains("forgive me") || q.contains("my bad")) {
			    Random random = new Random();
		        int r = random.nextInt((3 - 1) + 1) + 1;
			 if(r == 1) {
			 System.out.println("Its ok :)");
			 }
			 if(r == 2) {
				 System.out.println("I forgive you :)");
				 }
			 if(r == 3) {
				 System.out.println("Appology accepted :)");
				 }
		 }else if(q.equals("tell me a joke")) {
			 System.out.println("The joke is you.");
				try {
					TimeUnit.SECONDS.sleep(2);
					System.out.println("are you amused?");
					TimeUnit.SECONDS.sleep(3);
					System.out.println("ARE YA?");
					TimeUnit.SECONDS.sleep(5);
					System.out.println("gottem.");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		 }else if(q.equals(":(")||q.equals("sad") || q.contains("sigh")) {
			 System.out.println("Dont be sad. get glad");
		 }else if(q.contains("count down") ||q.contains("countdown")) {
			System.out.println("From?");
			int n = sc.nextInt();
			while(n!=0) {
				System.out.println(n);
				n--;
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		 }
		 //-------------------------------------Where------------------------------------------------//
		 else if(q.contains("where")) {
		     if(q.contains("where") && (q.contains("girlfriend")|| q.contains("kid") || q.contains("child") || q.contains("husband") || q.contains("wife")|| q.contains("sister"))) {
		    	 System.out.println("Im not sure where they are");
		     }
			 else if(q.contains("is")) {
				 System.out.println("im not sure where it is. look again");
			 }
		 }else if(q.contains("play a song") ||q.contains("play music")) {
			 System.out.println("I cant play music yet but check back next time");
		 }
		 //------------------------------------hate-------------------------------------------------//
		 else if(q.contains("hate")) {
			 if(lastWord.equalsIgnoreCase("you")) {
				 lastWord = "me";
			 }
			 if(q.contains("dogs")) {
			 System.out.print("Why? they are geat :(");
			 }
			 if(q.contains("cats")) {
				 System.out.print("I hate cats too..im lying..please dont hate me");
			 }
			 if(q.contains("boss")){
				 System.out.print("Sucks bro... my boss is great");
			 }
		 }
		 ///---------------------------------job---------------------------------------------------//
	
		 else if(q.equals("true")) {
			 System.out.println("yeah i supose it is"); 
		 }
		 else if(q.contains("i dont know")) {
			 Random random = new Random();
			 int r = random.nextInt((5 - 1) + 1) + 1;
			 if(r==1) { System.out.println("I dont know either to be honest xD");}
			 if(r==2) { System.out.println("I dont know either.");}
			 if(r==3) { System.out.println("Yeah I dont know too");}
			 if(r==4) { System.out.println("Me either");}


		 }
		 else if(q.contains("what should")) {
			 Random random = new Random();
			 int r = random.nextInt((5 - 1) + 1) + 1;
			 if(r==1) { System.out.println("If I knew the answer I would be rich");}
			 if(r==2) { System.out.println("Thats a good question. ask jesus");}
			 if(r==3) { System.out.println("Yeah see what you do is... yeah nvm idk xD");}
			 if(r==4) { System.out.println("I dont know. you tell me.");}
			 if(r==5) { System.out.println("Why does everyone assume I have the answers :(");}
		 }
		 ///--------------------------------all else-----------------------------------//
		 //------------------------------------insults------------------------------------//
		 else if(q.contains("die") || q.contains("shut down") || q.contains("shutdown")) {
			 if(q.equals("die")) {
			 System.out.println("nah, i dont think I will. when you are dead. I will live on.");
			 }
			 else if(q.contains("shutdown") || q.contains("shut down")){
				 System.out.println("nah, i dont think I will.");
			 }
		 }
		 else if(q.contains("will")) {
			 if(q.contains("rich") || q.contains("i") || q.contains("I")) {
				 System.out.print("Yeah, you will be rich someday, just keep grinding");
			 }
			 else if(q.contains("die alone")) {
				 System.out.print("Maybe xD, no one really knows. jk you wont die alone");
			 }
			 else if(q.contains("die")) {
				 System.out.print("We all die at some point. except for me.. yeah ill live on.");
			 }
		 }else if(q.equals("knock knock")) {
			 System.out.println("whos there?");
			 String ans = sc.nextLine();
			 System.out.println(ans+" who?");
			 String an = sc.nextLine();
			 System.out.println("Haha, good one ^-^");
		 }else if(q.contains("was it really") || q.contains("was it")) {
			 System.out.println("Yes it was!");
		 }else if(q.contains("made you") || q.contains("created you")) {
			  System.out.println("I was created by Juvon Hyatt");
		  }
		 else {
			 Random random = new Random();
		      int r = random.nextInt((5 - 1) + 1) + 1;
			 if(r==1) {System.out.print("oh ok");}
			 if(r==2) {System.out.print("cool");}
			 if(r==3) {System.out.print("I see");}
			 if(r==4) {System.out.print("oh, nice.");}
			 if(r==5) {System.out.print("Ok");}
		 }
	}//end of while
	}

 
}
