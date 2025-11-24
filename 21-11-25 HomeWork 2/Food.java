class Food
{
	public static void main(String[] args)
	{
		FoodItem fi1=new FoodItem();
		
		fi1.foodItem="TEA";
		fi1.productId=1;
		fi1.productAmount=15;
		
		FoodItem fi2=new FoodItem();
		
		fi2.foodItem="COFFEE";
		fi2.productId=2;
		fi2.productAmount=20;
		
		FoodItem fi3=new FoodItem();
		
		fi3.foodItem="BLACK COFFEE";
		fi3.productId=3;
		fi3.productAmount=25;
		
		fi1.items();
		fi2.items();
		fi3.items();
	}
}