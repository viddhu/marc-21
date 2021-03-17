package org.inte;
import java.util.ArrayList;
import java.util.List;
public class Client {
	public static void main(String[] args) {
		Strial s = new Strial();
		s.setId(13);
		s.setName("moon");
		s.setMobile(344928l);
		Strial a = new Strial();
		a.setName("sun");
		a.setId(15);
		a.setMobile(73987987l);
		List<Strial>l=new ArrayList();
		l.add(a);
		l.add(s);
		for (int i=0;i<l.size(); i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getMobile());
			
		}
		
	}

}