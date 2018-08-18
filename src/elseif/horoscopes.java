package elseif;

import javax.swing.JOptionPane;

public class horoscopes {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your horoscope?");
	if (answer.equals("Aries")) { JOptionPane.showMessageDialog(null, "Relax today and enjoy being with others socially, entertain or spend the day with company.\n" + 
			"\n" + 
			"If you feel like you need to cut loose and relax today, go for it and enjoy it, youve earned it. "
			+ "Socialise with friends, family and colleagues, throw a party or meet up for a day out. "
			+ "Entertaining can make you feel good and can raise your emotions, but if you just want to sit back, organise a group outing and relax. Go to the cinema or for a meal, just enjoy the company.");}
	else if (answer.equals("Taurus")) { JOptionPane.showMessageDialog(null, "Deal with long buried issues when they pop up today, "
 		+ "put them in their place and move on.\n" + 
 		"\n" + 
 		"As long buried issues start to resurface again today, "

 		+ "make yourself a promise youll deal with them this time and face up to them. This could be hard for you, but you need to put these things in their place so you can move forward without the baggage. Dealing with this could be emotionally draining, so stay away from other sensitive issues until you are stronger again.");}
 else if (answer.equals("Gemini")) { JOptionPane.showMessageDialog(null, "Someone in your family needs you today but they dont know how to ask, look out for them and offer help.\n" + 
		"\n" + 
		"When family members come to you for support and help today, you are happy to give them anything they need, but be aware that someone will find it hard to ask for help. They might not be sure how to find the words or if they are overstepping a mark, so look out for someone who you can see needs you and be the one to reach out to them with an offer of support.");}
else if (answer.equals("Cancer")) { JOptionPane.showMessageDialog(null, "You have the power to change a situation that doesnt make you happy today, harness you energy.\n" + 
		"\n" + 
		"Something in your life has been bringing you down lately, but you are the only one with the power to change this. You have good mental and spiritual energy right now, so harness this and use it to make things better. Happiness is the goal and you should always be moving towards that, dont settle for a situation that isnt making you happy.");}
else if (answer.equals("Leo")) { JOptionPane.showMessageDialog(null, "With Mercury in sextile with Venus today you have little patience for drama and games.\n" + 
		"\n" + 
		"Mercury in Leo is in sextile with Venus today, making you even less patient than usual with drama and games. Above all you respect and expect truth and honesty and when others are creating scenes today you tire of them pretty quick. Stay away from all this as much as you can and dont let it influence your mood and your energy, keep your own standards.");}
else if (answer.equals("Virgo")) { JOptionPane.showMessageDialog(null, "Get out there and let people know who you are and good things will come to you, also watch your spending today.\n" + 
		"\n" + 
		"You need a two pronged attack to your day today, Virgo. On the one hand you should be careful with your money, dont spend hastily and dont throw money away on unnecessary things. On the other hand you should put yourself out there for things to happen. Good things can come your way, but others need to know you exist first and what you can do!" );}
else if (answer.equals("Libra")) { JOptionPane.showMessageDialog(null, "Energy from Venus in sextile with Mercury today helps you push forward when an opportunity comes.\n" + 
		"\n" + 
		"Venus in Libra is in sextile with Mercury today, giving you a boost to your personal energy. When a big opportunity comes up later on, push yourself forward and be the one who is seen and heard. You need to get to the front of the queue for this and be prominent. You deserve this opportunity so go for it with all you have and be forceful in your approach.");}
else if (answer.equals("Scorpio")) { JOptionPane.showMessageDialog(null, "As The Moon leaves your house today your confidence will dip, but others believe in you so trust yourself.\n" + 
		"\n" + 
		"The Moon leaves Scorpio today and you may lose a bit of confidence as it goes. Trust yourself and your abilities, others are seeing you as the one who can solve problems and find the missing piece of the puzzle and if everyone else thinks you can do it, you should believe it too. Gather your confidence back up and know that others cant all be wrong!");}
else if (answer.equals("Sagittarius")) { JOptionPane.showMessageDialog(null, "Use your adventurous spirit today to bring people and opposing ideas together and help them find common ground.\n" + 
		"\n" + 
		"You have a great adventurous spirit today, but instead of this meaning youll be out finding new horizons, its more likely to mean you can see roads ahead others cant. Youll be especially good at bringing people and opposing ideas together right now and you can help people find common ground where they think there is none. This is a rare talent so use it well.");}
else if (answer.equals("Capricorn")) { JOptionPane.showMessageDialog(null, "When someone comes to you with interesting news that inspires you to act, its either necessary or something you desire.\n" + 
		"\n" + 
		"You may feel a little restless this morning, but later on someone will come to you with some interesting news that inspires you or gives you the push you need, to take some action on something. This will be connected to either traveling or home improvements. One of these is something you desire and the other is something that seems necessary to you.");}
else if (answer.equals("Aquarius")) { JOptionPane.showMessageDialog(null, "If you sweep through tasks too quickly today you may miss the details, delegate the small things to someone else.\n" + 
		"\n" + 
		"You are very organised today and you can get a lot done, but dont get so swept along with working through your list that you forget about the details of each task. Its the little things that can matter most and if you find you are going through things without the chance to check properly, consider delegating to someone else, its better than making mistakes.");}
else if (answer.equals("Pisces")) { JOptionPane.showMessageDialog(null, "Stay away from the negative today and surround yourself with positive, and you will get a boost.\n" + 
		"\n" + 
		"Its important that you surround yourself with positive and supportive people today and you stay away from negative people and negative situations. The good people around you will elevate you and in your work life especially, they will highlight your achievements and really big you up. This could lead to some financial boost, but you may have to be patient for this.");}
else {JOptionPane.showMessageDialog(null, "That's not a star sign!");}
}

}
