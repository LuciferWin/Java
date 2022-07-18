package Day11;

public class ProductService extends DatabaseUtil{

	@Override
	public void insert() {
		System.out.println("Insert into product");		
	}

	@Override
	public void update() {
		System.out.println("Update product table");		
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Delete from table where id = " + id);
		return false;
	}

	@Override
	public Object findById(int id) {
		System.out.println("Select * from product where id = " + id);
		return null;
	}

}
