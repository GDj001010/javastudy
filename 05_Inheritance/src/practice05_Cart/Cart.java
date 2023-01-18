package practice05_Cart;

public class Cart {
	
	private Product[] products;		// 제품들이 들어갈 공간,  배열 선언
	private int prodCount;			// 카트에 들어간 제품의 갯수
	
	// new Cart(10), Cart(20), ....
	
	// 카트 생성자
	public Cart(int cartSize) {
		products = new Product[cartSize];	// 배열 생성
		
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getProdCount() {
		return prodCount;
	}

	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}
	
	
	
	
	
	// 카트에 물건 담기
	// addProduct(new Meat(1, "소고기", 5000));
	// addProduct(new Pizza(2, "고구마피자" 3000));
	// addProduct(new Noodle(3, "누들면", 1500));
	public void addProduct(Product product) {
		
		// 카트가 가득 차면 물건을 담지 못 한다.
		if(products.length == prodCount) {
			System.out.println("카트가 가득 찼습니다.");
			return;
		}
		
		// 카트에 물건 담기
		products[prodCount++] = product;
		
	}
	
	
	
	// 카트에서 물건 빼기
	public void deleteProduct(int prodNo) {
		
		// 카트가 비어 있으면 뺼 문건이 없다.
		if(prodCount == 0) {
			System.out.println("카트가 비어있습니다.");
			return;
		}
		
		// 카트에서 물건 빼기   집에서 제품들 복사해서 앞으로 이동시키기 연습
		for(int i = 0; i < prodCount; i++) {
			if(products[i].getProdNo() == prodNo) {		// 부모 필드 사용 ProdNo
				products[i] = products[--prodCount];	// 마지막 물건을 뺀 물건 자리로 옮기기, Count 하나 줄이기 동시에 하기
				break;
			}
		}
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
