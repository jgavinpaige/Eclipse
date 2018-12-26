import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * This class is used for HTML parsing from URL using Jsoup.
 * @author Andrew Schwartz
 */

public class Test {
	public static void main(String args[]){
		print("running...");
		Document document;
		try {
			//Get Document object after parsing the html from given url.
			document = Jsoup.connect("http://www.zillow.com/denver-co/").get();

			String title = document.title(); //Get title
			print("  Title: " + title); //Print title.
			Elements address = document.select("span[itemprop]:contains(Denver CO)");//get address
			Elements price = document.select(".zsg-photo-card-price:contains($)"); //Get price
			
			for (int i=0; i < price.size(); i++) { //print price/address
				print(address.get(i).text() + " " + price.get(i).text());
			}

		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		print("done");
	}

	public static void print(String string) {
		System.out.println(string);
	}
}