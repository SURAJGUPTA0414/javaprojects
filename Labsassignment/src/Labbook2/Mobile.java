import java.util.ArrayList;
import java.util.HashMap;

class Mobile
{
	HashMap<String, ArrayList<String>> mobiles=new HashMap<String,ArrayList<String>>();
	ArrayList<String> li=new ArrayList<String>();
	
	public String addMobile(String company,String model)
	{		
		mobiles.putIfAbsent(company, li);
	    if(mobiles.containsKey(company))
	    {
	    	li.add(model);
	    }
	
	//System.out.println("addmobile start");
//			mobiles.put(company, li);
//			System.out.println(li);
			return "model successfully added";
		}
		
		public ArrayList<String> getModel(String company)
		{//System.out.println("get mobile start");
			if(mobiles.containsKey(company))
			{
			  return li;
			}
			else if(!mobiles.containsKey(company) )//     || !li.contain(model))
			{
			    return null;
			}
			else
				return li;
			}
		
		public String buyMobiel(String company,String model)
		{String msg="";
			if(mobiles.containsKey(model) || li.contains(model))
			{
				li.remove(model);
			    msg="mobile sold successfully";	
			}
			else
			{
			  msg="items not available";	
			}
			return msg;
		}
	
	}



	public class source2 
	{
		public static void main(String[] args) throws Exception 
         {
	       Mobile obj= new Mobile();
	       System.out.println(obj.addMobile("Oppo","K3"));
	    System.out.println(   obj.getModel("Oppo"));
	      System.out.println( obj.buyMobiel("Oppo","K3"));
	
         }
	}
