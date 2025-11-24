class Foods
{
	public static void main(String[] args)
	{
		FoodItems fi1=new FoodItems();
		
		fi1.foodItem="IDLY";
		fi1.productId=1;
		fi1.productAmount=8;
		
		FoodItems fi2=new FoodItems();
		
		fi2.foodItem="POORI";
		fi2.productId=2;
		fi2.productAmount=30;

        FoodItems fi3=new FoodItems();

		fi3.foodItem="DOSA";
		fi3.productId=3;
		fi3.productAmount=25;

        fi1.food();
        fi2.food();
        fi3.food();		
	}
}