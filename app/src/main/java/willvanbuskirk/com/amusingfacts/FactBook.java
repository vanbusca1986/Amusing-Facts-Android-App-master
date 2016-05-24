package willvanbuskirk.com.amusingfacts;

/**
 *
 */
public class FactBook {
    private RandomNoRepeat randomNoRepeat = new RandomNoRepeat(); //creates instance of RandomNoRepeat.java object

    public String[] trumpFacts = { //array containing trumpFacts
            "# 1. Trump went to elementary school and junior high in Queens, N.Y., but after getting into some trouble in his early teen years, his parents moved him to the New York Military Academy",
            "# 2. Many know him as \"The Donald,\" but others call him DJT, short for Donald John Trump.",
            "# 3. Trump won a Razzie Award for Worst Supporting Actor for his cameo appearance as himself in the 1990 movie \"Ghosts Can't Do It.\" ",
            "# 4. Considering Trump's love for publicity, you wouldn't expect the following quote to be attributed to him, but he is credited with saying: \"Part of being a winner is knowing when enough is enough. Sometimes you have to give up the fight and walk away, and move on to something that's more productive.",
            "# 5. During a visit to \"Late Night with Conan O'Brien\" Trump claimed he's never used an ATM.",
            "# 6. His sister, Maryanne Trump Barry, is a Senior United States Circuit Judge. These positions are nominated by the President of the United States and Maryanne was nominated into the position in 1999 by then President Bill Clinton. This was despite her being a Republican.",
            "# 7. In 1991, Trump Plaza was fined $200,000 for removing African American gamblers from a craps table where mob associate Robert LiButti wanted to play. LiButti was apparently known to go into racist fits when he was losing.",
            "# 8. In 2013, Bill Maher offered $5 million to anyone who could produce evidence that Trump’s mother had not had mated with an orangutan. Trump promptly produced his birth certificate proving his father wasn’t an ape and then sued Maher when he wasn’t given the stated $5 million. The suit was ultimately dismissed.",
            "# 9. Trump thought his paternal grandfather was Swedish for years because his dad had presented the Trump family as being from Sweden instead of Germany. Why? Because, as Trump’s father explained, in the 1960s, “he had a lot of Jewish tenants and it wasn’t a good thing to be German.” The Holocaust had occurred less than two decades previous.",        
            "# 10. His Father Started the Company That Became a Real Estate Empire",
            "# 11. He Is One of 5 Children & His Sister is a Federal Judge",
            "# 12. He Married His 3rd Wife Melania Knauss in 2005",
            "# 13. He Has 5 Children With His 3 Wives",
            "# 14. He thinks 'bigly' is a word",
            "# 15. He has stated that he 'has a great relationship with \"the blacks.\".",
            "# 16. If Donald Trump did get elected, there'd be hell toupée.",
            "# 17. He made his presidential announcement with a piece of food on the outside of his mouth.",
            "# 18. He failed at owning a professional football team.",
            "# 19. Trump used the Amtrak crash to self-promote: Emergency personnel were still sifting through the wreckage when Trump fired out a series of promotional tweets, including a since-deleted message noting that \"The only one to fix the infrastructure of this country is me!\"",
            "# 20. Trump pivoted from Obama's birth certificate to Ted Cruz's Canadian heritage: \"It's a hurdle nobody else has,\" he said, also complaining that Cruz stole the line \"make America great again\" from him, forgetting of course that he himself stole it from Reagan",
            "# 21. Trump insisted Mitch McConnell, then Senate majority leader, \"may be the next Speaker.\"",
            "# 22. Trump has the same interior decorator who furnished Saddam's palaces,",
            "# 23. Our country is in serious trouble. We don't have victories any more,' Trump said. 'When did we beat Japan at anything? he asked, citing auto sales but apparently forgetting World War II.",
            "# 24. He wants to build a wall across the border between U.S. and Mexico. Then he wants to charge Mexico for the costs.",
            "# 25. Trump sent a crew of investigators to Hawaii to pursue his accusations on President Barrack Obama's birth not being in Hawaii.",
            "# 26. At his rally's, Trump derides poor people with 'If I can do it, you can,' while carefully avoiding the fact he was handed 10 million to start.",
            "# 27. Trump has a commitment to overcomb any obstacle.",
            "# 28. He has contributed financially to both Democrats and Republicans.",
            "# 29. Trump was voted \"Ladies Man\" by his all-male high school peers.",
            "# 30. When he wakes up and looks in the mirror, he looks different. His remarkable hairline is achieved after blow-drying his hair forward and then combing it backward.",
            "# 31. Trump is the only presidential candidate with his own board game, titled Trump: The Game. The monopoly-like game launched in 1989 and was ultimately discontinued after dismal sales and poor reviews. ",
            "# 32. A germaphobe, Trump dislikes shaking hands. When forced to shake hands, he has an interesting technique of vigorously pulling the other person close into his body. ",
            "# 33. Trump once sued an airport for being too loud near his property",
            "# 34. Trump hosted his own reality TV show, “The Apprentice,” starting in 2004 on NBC. The purpose of the show is to eliminate contestants in order to find a head for one of Trump’s companies. Trump was paid $375,000 per episode of the show.",
            "# 35. In 2007, Trump received his own Hollywood Walk of Fame star for his role as producer of “The Apprentice.” His star was the 2,327th added to the Walk of Fame.",
            "# 36. Trump has had three wives—Ivana (1977-1992), Marla Maples (1993-1999) and Melania Knauss. He and Knauss have been married since 2005. Altogether, Trump has five children, including Donald Jr. (1977), Ivanka (1981), Eric (1984), Tiffany (1993) and Barron (2006)",
            "# 37. Trump has owned the Miss Universe Organization since 1996. In 2003, NBC became a joint partner of the organization with Trump. The Miss Universe Organization also produces the Miss USA and Miss Teen USA pageants.",
            "# 38. Trump’s parents sent him to the New York Military Academy when he was 13 because he was an energetic child. They thought the institution would teach him some discipline. He graduated from the military academy in 1964 before continuing his education at Fordham University and eventually, the University of Pennsylvania",
            "# 39. In 1990, Donald Trump almost had to file personal and business bankruptcy. In just four years he was able to pay back $900 million in personal debt and was also able to reduce the debt his business had acquired. Trump is now worth $2.6 billion dollars and owns more than 100 companies.",
            "# 40. Trump bought an airline. In 1989, he bought Eastern Air Shuttle. Trump pushed to turn this airline into a luxury experience. Ultimately it failed because the customers liked the airline for its convenience not the new fancy look combine that with high fuel prices the airline never made a profit.",
            "# 41. (At Trump university) Teachers were instructed to pretend they knew Trump even when they didn’t.",
            "# 42. (At Trump university) Trump promised students he handpicked his teachers. He did not.",
            "# 43. Trump was misleading voters about the program’s (Trump University) approval ratings.",
            "# 44. (At Trump university) Teachers were told to use “buzzwords” that made the program appear “elitist.",
            "# 45. He once insulted Ronald Reagan",
            "# 46. Trump once mocked the physical handicap of a disabled reporter from the New York Times.",
            "# 47. During High School he was a strong offensive player in football",
            "# 48. He called out the missing Paris to Cairo flight a terrorist attack before any substantial information was known",
            "# 49. He helped America develop more compassion for Mexican Immigrants and women.",
            "# 50. The presumptive Republican nominee for president once feuded with the Pope",
            "# 51. Trump did not know the difference between Hamas and Hezbollah.",
            "# 52. Trump was not familiar with the term “Nuclear Triad.",
            "# 53. Trump once publicly called for the death penalty of five black teenagers who were later exonerated of their crime.",
            "# 54. Trump has believed that the concept of global warming was created by and for the Chinese in order to make U.S. manufacturing non-competitive.",
            "# 55. Trump has cheered for the demise of the New York Times and the Washington Post.",
            "# 56. Trump has praised the journalistic work of the National Enquirer.",
            "# 57. Trump has proposed banning immigration for members of a religion of one billion people.",
            "# 58. Trump has said that Mike Tyson’s rape victim 'wanted it real bad.'",
            "# 59. Trump has said that the battle to avoid getting a sexually transmitted disease was his own “personal Vietnam.”",
            "# 60. Donald has once attempted to have police remove disabled veteran street vendors from the street in front of his apartment building because he found them unsightly.",
            "# 61. Donald has used the debate stage to brag about the size of his genitals.",
            "# 62. Donald has said women should face “some sort of punishment” if they have an illegal abortion.",
            "# 63. Donald has has declined to rule out the possibility of using nuclear weapons in Europe.",
            "# 64. Donald has said that the U.S. should kill the families of suspected terrorists, a violation of the Geneva Convention.",
            "# 65. Donald has said that he does not believe in climate change, but does believe in “weather.",
            "# 66. Donald has said that “Islam hates” the United States.",
            "# 67. Donald lied to a room of supporters and press about the existence of Trump Steaks, his long-discontinued brand of meats.",
            "# 68. Donald was at the forefront of the racist Birther movement, which fruitlessly hunted for proof that Barack Obama was not an American.",
            "# 69. Donald once tried to sue a biographer for allegedly underestimating his wealth. (The presumptive Republican nominee for president lost.)",
            "# 70. Donald failed to immediately disavow the endorsement of a white supremacist and KKK groups.",
            "# 71. Donald has won the endorsements of several white supremacy and white nationalist groups.",
            "# 72. Donald has approvingly retweeted a quote by Benito Mussolini.",
            "# 73. Donald has approvingly retweeted an account called @WhiteGenocideTM.",
            "# 74. Donald has approvingly retweeted a phony statistic on black-on-black crime meant to stir up resentment in whites.",
            "# 75. Trump claimed that 6 million people over age of 112 are receiving Social Security benefits when just 55,000 people over the age of 100 were alive in the U.S.",
            "# 76. Trump told Howard Stern that he could have “nailed” Princess Diana just days after she died in a car accident.",
            "# 77. Trump told Howard Stern that he 'won’t do anything to take care' of his children except 'supply funds.'",
            "# 78. Trump has said “torture works” and that he would “absolutely” authorize something “beyond waterboarding.” (Believe me, it works. Okay?” he added.)",
            "# 79. Trump has called one of his primary opponents a pussy.",
            "# 80. Trump has said he could “stand in the middle of 5th Avenue and shoot somebody” without losing voters.",
            "# 81. Trump has suggested that a female journalist was menstruating after she asked him a question about his record of misogynistic comments.",
            "# 82. Trump has said he would “get along very well” with Vladimir Putin.",
            "# 83. Trump has praised Vladimir Putin’s leadership after being asked about Putin’s murder of oppositional journalists.",
            "# 84. Trump was associated with the Democratic party from 2001 to 2009",
            "# 85. Trump's sister Maryanne is an acting federal judge",
            "# 86. Trump has yet to disclose his tax information",
            "# 87. According to Forbe's Trump's net worth is around 4 Billion.",
            "# 88. (Trump University) A $34,995 mentorship program was worth 'nothing,' one participant said.",
            "# 89. (Trump University) a participant went into debt to take a $25,000 course at Trump University. Today he can’t afford his own home.",
            "# 90. Trump is now in law suits dealing with the legitimacy of Trump University",
            "# 91. Trump has openly called Rosie O'Donnel a fat pig",
            "# 92. Trump was a troublemaker as a child.",
            "# 93. Trump has openly admitted to cheating with married women",
            "# 94. Trump has stated that the system was 'Stacked' against him due to his weak delegate count at the time.",
            "# 95. Senator Lindsey Graham has stated the choice between Ted Cruz and Donald Trump was like being shot or stabbed.",
            "# 96. Trump has mentioned that he was invited multiple times to John Oliver's HBO show 'Last Week Tonight' when there is absolutely no evidence he was ever.",
            "# 97. Trump has changed his comment on banning Muslims entering the country to just a 'suggestion' in his words",
            "# 98. Donald Trump is a successful Author with books such as 'Think Big and Kick Ass'",
            "# 99. Jon Stewart said that Trump was a man-baby",
            "# 100. Jon Oliver has said Trump has tiny baby hands",
   
    };

    public String[] historyFacts = { //array containing historyFacts
            "# 1. An ‘extremely credible source’ has called my office and told me that Barack Obama’s birth certificate is a fraud",
            "# 2. Robert Pattinson should not take back Kristen Stewart. She cheated on him like a dog & will do it again – just watch. He can do much better!",
            "# 3. Ariana Huffington is unattractive, both inside and out. I fully understand why her former husband left her for a man – he made a good decision.",
            "# 4. You know, it really doesn’t matter what the media write as long as you’ve got a young, and beautiful, piece of ass.",
            "# 5. I will build a great wall – and nobody builds walls better than me, believe me – and I’ll build them very inexpensively. I will build a great, great wall on our southern border, and I will make Mexico pay for that wall. Mark my words.",
            "# 6. When Mexico sends its people, they’re not sending the best. They’re not sending you, they’re sending people that have lots of problems and they’re bringing those problems with us. They’re bringing drugs. They’re bring crime. They’re rapists… And some, I assume, are good people.",
            "# 7. Our great African-American President hasn’t exactly had a positive impact on the thugs who are so happily and openly destroying Baltimore.",
            "# 8. We have a trade deficit with Japan of over $100 billion a year.",
            "# 9. We’re losing our jobs and the politicians don’t tell you that.",
            "# 10. We don’t win at trade. We lose to everybody at trade. Trade we lose to everybody.",
            "# 11. Remember we used to have Made in the USA, right? When was the last time you’ve seen it? You don’t see that anymore. You don’t see that anymore.",
            "# 12. We have lousy health-care, where it’s going up 35, 45, 55 percent.",
            "# 13. If you look at the jobs reports, which are totally phony, because if you stop looking for a job you are essentially considered employed.",
            "# 14. I know there are some companies where the people were full time for 25 years. Now they’re part-timers and they go out and get another job, and that has to do solely with Obamacare.",
            "# 15. The migration, they’re coming across. Obama wants to bring thousands and thousands of people in. He has no idea who they are.",
            "# 16. I’m not taking money. ... I’m not taking. I spent a lot of money. I don’t take",
            "# 17. I’m not going to take any money. I don’t want any money. ... You know, I’ve self-funded my campaign. ... Right now, I’m into, you would know better than me, maybe $30 million, maybe more.",
            "# 18. So many horrible, horrible things said about me in one week. $38 million worth of horrible lies.",
            "# 19. Little Marco Rubio. You know, he’s a no-show in the U.S. Senate. He never goes to vote.",
            "# 20. Wasn’t that funny last night when Cruz said, ‘I’m the only one that can beat Donald Trump. I have demonstrated that I can beat him. I won five states.",
            "# 21. We’re winning every poll with the Hispanics.",
            "# 22. We have tremendous problems with crime and other things.",
            "# 23. If you look at the Iran deal, where we give a terror nation $150 billion” and “got nothing",
            "# 24. The Gulf states aren’t spending. The Gulf states have so much money, they’re not spending anything. By the way, they’re not taking anybody, they’re not taking, they’re not spending.",
            "# 25. It turned out I’m much richer than people think.",
            "# 26. It’s the largest winery on the East Coast. I own it 100 percent. No mortgage. No debt. You can all check. You have to go check the records, folks. In fact, the press, I’m asking you, please check.",
            "# 27. I built an unbelievable, some of the greatest assets in the world, very little debt, tremendous cash flow, tremendous. ... Almost all of my businesses work.",
            "# 28. Eight weeks ago, they signed a budget that is so bad. It funds ISIS.",
            "# 29. Then all of a sudden they [WSJ/NBC] come up with this poll that was very close. They put it on the front-page of the Wall Street Journal, front-page. They never do that. ... I never do well in the Wall Street Journal polls; it’s set against me.",
            "# 30. They [the WSJ/NBC poll] had me practically dying in South Carolina the day before. ... And it looked like I was really in trouble and then I won in a landslide. The poll was wrong.",
            "# 31. All of the women on ‘The Apprentice’ flirted with me — consciously or unconsciously. That’s to be expected.",
            "# 32. There is something on that birth certificate — maybe religion, maybe it says he’s a Muslim, I don’t know. Maybe he doesn’t want that. Or, he may not have one.",
            "# 33. Our weak President, that kisses everybody’s ass, is in more wars than I have ever seen. Now he’s in Libya, he’s in Afghanistan, he’s in Iraq. Nobody respects us.",
            "# 34. There’s nobody bigger or better at the military than I am",
            "# 35. So many people have told me that I should host Meet the Press and replace the moron who is on now. Just too busy, especially next 10 years!",
            "# 36. Sorry losers and haters, but my I.Q. is one of the highest -and you all know it! Please don't feel so stupid or insecure, it's not your fault.",
            "# 37. Sadly, because president Obama has done such a poor job as president, you won't see another black president for generations",
            "# 38. I look forward to the debate on Thursday night & it is certainly my intention to be very nice & highly respectful of the other candidates.",
            "# 39. I know the Chinese. I've made a lot of money with the Chinese. I understand the Chinese mind.",
            "# 40. He's a war hero because he was captured. I like people who weren’t captured. Perhaps he's a war hero,",
            "# 41. You know, it doesn't really matter what [the media] write as long as you've got a young and beautiful piece of ass",
            "# 42. I have never seen a thin person drinking Diet Coke.",
            "# 43. 'You’re disgusting' – said to a female lawyer during a court case after she asked for a break to pump breast milk for her 3-month-old daughter.",
            "# 44. Ariana Huffington is unattractive, both inside and out. I fully understand why her former husband left her for a man. He made a good decision",
            "# 45. A person who is flat-chested is very hard to be a ten",
            "# 46. Women. You have to treat them like shit",
            "# 47. The look obviously matters. Like you wouldn't have your job if you weren't beautiful",
            "# 48. That must be a pretty picture you dropping to your knees",
            "# 49. The only difference between me and the other candidates is that I'm more honest and my women are more beautiful",
            "# 50. I have seen women manipulate men by just a twitch in their eye- or perhaps another body part",
            "# 51. Beauty and elegence, whether in a women, a building or a work of art, is not just superficial or something pretty to see",
            "# 52. I would never buy Ivana any decent jewels or pictures. Why give her negotiable assets?",
            "# 53. [Angelina Jolie’s] been with so many guys she makes me look like a baby... And, I just don’t even find her attractive.",
            "# 54. 'Look at that face!' said of former Republican presidential candidate Carly Fiorina. “Would anyone vote for that? Can you imagine that, the face of our next president?!",
            "# 55. Cher is somewhat of a loser. She's lonely. She's unhappy. She's very miserable.",
            "# 56. 'You could see there was blood coming out of her eyes, blood coming out of her wherever. In my opinion, she was off base,' Trump said of Fox News’ Megyn Kelly",
            "# 57. 'How stupid are the people of Iowa?' after talking about a poll showing Ben Carson was beating him in Iowa",
            "# 58. I'm not sure I have ever asked God's forgiveness",
            "# 59. I watched when the World Trade Center came tumbling down. And I watched in Jersey City, New Jersey, where thousands and thousands of people were cheering as that building was coming down. Thousands of people were cheering.",
            "# 60. Beautiful, famous, successful, married – I’ve had them all, secretly, the world’s biggest names, but unlike Geraldo I don’t talk about it.",
            "# 61. The other thing with the terrorists is you have to take out their families, when you get these terrorists, you have to take out their families.",
            "# 62. We’re losing a lot of people because of the Internet. We have to see Bill Gates and a lot of different people who really understand what’s happening and maybe, in some ways, closing that Internet up in some ways.",
            "# 63. The Canadian plan also helps Canadians live longer and healthier than America. … We need, as a nation, to reexamine the single-payer plan, as many individual states are doing. -(2000)",
            "# 64. I identify more as a Democrat. – (2004)",
            "# 65. I think Bush is probably the worst President in the history of the United States.",
            "# 66. Bush was a disaster for the country as well as for the Republican Party. Then he asked me about Barack Obama. I told him that Barack will need to be a great president because we’re in serious trouble as a country. It hasn’t been this way since 1929. So he doesn’t have much choice—he will simply have to be great, which he has a very good chance of being. What he has done is amazing. The fact that he accomplished what he has—in one year and against great odds—is truly phenomenal.- (2009)",
            "# 67. (Michael Bloomberg is) a friend of mine. He's been an excellent mayor of New York City. He's a great guy and he means very well.- (2013)",
            "# 68. (Hillary Clinton is) very talented, very smart. She's a friend of mine, so I'm a little prejudiced. (2007)",
            "# 69. I know Hillary and I think she’d make a great president or vice-president. – 2008",
            "# 70. Robert Pattinson should not take back Kristen Stewart. She cheated on him like a dog & will do it again – just watch. He can do much better!",
            "# 71. Did you read about Starbucks? No more 'Merry Christmas' at Starbucks. No more. Maybe we should boycott Starbucks.",
            "# 72. It’s like in golf. A lot of people — I don’t want this to sound trivial — but a lot of people are switching to these really long putters, very unattractive. It’s weird. You see these great players with these really long putters because they can’t sink three-footers anymore. And I hate it. I am a traditionalist. I have so many fabulous friends who happen to be gay, but I am a traditionalist.",
            "# 73. I’m the worst thing that’s ever happened to ISIS.",
            "# 74. If I were running ‘The View’, I’d fire Rosie O’Donnell. I mean, I’d look at her right in that fat, ugly face of hers, I’d say ‘Rosie, you’re fired.",
            "# 75. One of they key problems today is that politics is such a disgrace. Good people don’t go into government.",
            "# 76. The beauty of me is that I’m very rich.",
            "# 77. The point is, you can never be too greedy.",
            "# 78. Sorry, there is no STAR on the stage tonight! (on Democrat debate)",
            "# 79. My Twitter has become so powerful that I can actually make my enemies tell the truth.",
            "# 80. The other candidates — they went in, they didn’t know the air conditioning didn’t work. They sweated like dogs...How are they gonna beat ISIS? I don’t think it’s gonna happen.",
            "# 81. Look at those hands, are they small hands? And, [Republican rival Marco Rubio] referred to my hands: 'If they're small, something else must be small.' I guarantee you there's no problem. I guarantee.",
            "# 82. Lyin' Ted Cruz just used a picture of Melania from a shoot in his ad. Be careful, Lyin' Ted, or I will spill the beans on your wife!",
            "# 83. I was down there, and I watched our police and our firemen, down on 7-Eleven, down at the World Trade Center, right after it came down",
            "# 84. There can be no discrimination against gays. I’m against gay marriage.",
            "# 85. We have some very terrible Supreme Court justices, and frankly, they should have at least had that [same-sex marriage case] as a state’s right issue.",
            "# 86. About homophobic Miss USA contestant Carrie Prejean: “That’s the belief of 70 percent of the people, so it wasn’t a horrible answer.",
            "# 87. Regarding equal treatment for LGBT people: It’s something I haven’t given lots of thought to",
            "# 88. Laziness is a trait in blacks.",
            "# 89. What a convenient mistake: @BarackObama issued a statement for Kwanza (sic) but failed to issue one for Christmas.",
            "# 90. It’s freezing and snowing in New York. We need global warming!",
            "# 91. Remember, new ‘environmentally friendly’ lightbulbs can cause cancer. Be careful: the idiots who came up with this stuff don’t care.",
            "# 92. China’s Communist Party has now publicly praised Obama’s reelection. They have never had it so good. Will own America soon.",
            "# 93. To the victor belong the spoils,” he said to Bill O’Reilly, about his stance of staying in Iraq after the war. Therefore he would “stay and we keep the oil.",
            "# 94. My whole life is about winning. I don't lose often. I almost never lose.",
            "# 95. Do you mind if I sit back a little? Because your breath is very bad.",
            "# 96. Hillary Clinton was the worst Secretary of State in the history of the country. The world came apart under her reign as Secretary of State.",
            "# 97. A little more moderation would be good. Of course, my life hasn't exactly been one of moderation.",
            "# 98. I like thinking big. If you're going to be thinking anything, you might as well think big.",
            "# 99. I actually don't have a bad hairline.",
            "# 100. Part of being a winner is knowing when enough is enough. Sometimes you have to give up the fight and walk away, and move on to something that's more productive.",
    };

    public String[] sportsFacts = { //array containing sportsFacts
            "Facts 1-8 -Xfinity Programmers",
            "http://fusion.net/story/298579/donald-trump-true-but-sad-nominee/",
            "https://www.theblot.com/8-really-good-things-about-donald-trump-7749457",
            "https://www.buzzfeed.com/sarahburton/trump-inspires-women?utm_term=.fq2vxaxWN#.vqwbz2zjg",
            "http://www.marieclaire.co.uk/blogs/550112/donald-trump-quotes.html",
            "http://www.usmagazine.com/celebrity-news/pictures/donald-trumps-most-offensive-and-outrageous-quotes-w167142/on-his-proposal-for-a-muslim-ban-w167152",
            "http://time.com/4250772/donald-trump-university/",
            "http://airborne.gogoinflight.com/abp/connecting.jsp?abpflg=2",
            "http://www.politico.com/magazine/story/2016/03/trump-fact-check-errors-exaggerations-falsehoods-213730",
            "http://www.rollingstone.com/politics/news/the-47-funniest-things-about-donald-trump-20150617?page=2"



            };


    public String[] animalFacts = {
            "Will had a good time in Vegas!",
            "We need to get this shit finished and deployed!",
            };

    int i = 0;
    String fact;
    int[] randomNoRepeatArray;
    String[] factsArray;

    int[] snappleFactsRandom = randomNoRepeat.getRandNumArray(trumpFacts.length); //gives random values with no repeat to array
    int[] historyFactsRandom = randomNoRepeat.getRandNumArray(historyFacts.length); //gives random values with no repeat to array
    int[] animalFactsRandom = randomNoRepeat.getRandNumArray(animalFacts.length); //gives random values with no repeat to array
    int[] sportsFactsRandom = randomNoRepeat.getRandNumArray(sportsFacts.length); //gives random values with no repeat to array

    public String getFacts(String factBookType) { 

        if (factBookType == "snappleFactsType") {
            factsArray = trumpFacts;
            randomNoRepeatArray = snappleFactsRandom;
        } else if (factBookType == "historyFactsType") {
            factsArray = historyFacts;
            randomNoRepeatArray = historyFactsRandom;
        } else if (factBookType == "sportsFactsType") {
            factsArray = sportsFacts;
            randomNoRepeatArray = sportsFactsRandom;
        } else if (factBookType == "animalFactsType") {
            factsArray = animalFacts;
            randomNoRepeatArray = animalFactsRandom;
        }

        if (i < (randomNoRepeatArray.length)) { //loops through all facts
            fact = factsArray[randomNoRepeatArray[i] - 1]; //pulls facts from SnappleFacts array; subtract -1 because randomNoRepeatArray[0]=1
        } else { //this will happen once all facts have been displayed
            fact = "Those are all the facts for this category for now... Check out another category!";
        }
        i++; //counter after each loop
        return fact; //returns fact to SnappleFactsActivity
    }
}
