import java.util.Scanner;

public class MySingleLinkedList {
	Node head;
	Scanner sc = new Scanner(System.in);
	public MySingleLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	void nhap() {
		int n, x;
		head = null;
		Node cuoi = null;
		System.out.println("Nhap so luong phan tu NODE: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
			x = sc.nextInt();
			Node t = new Node(x);
			if (head == null) {
				head = cuoi = t;
			} else {
				cuoi.next = t;
				cuoi = t;
			}
		}
	}
	void in() {
		Node p = head;
		System.out.println("Danh sach cac phan tu NODE");
		System.out.print("--> ");
		while (p != null) {
			System.out.print(p);
			p = p.next;
		}
		System.out.print("Null");
		System.out.println();
	}
	void timX()
	{
		Node p = head;
		if(p == null)
		{
			System.out.println("Danh Sach Rong");
		}
		int x;
		boolean check = false ;
		System.out.println("Nhap x can tim: ");
		x = sc.nextInt();
		while( p != null)
		{
			if(x == p.data)
			{
				check = true;
				break;
			}
			p = p.next;
		}
		if(check == false)
		{
			System.out.println("Khong co " + x +" trong NODE");
		}else {
			System.out.println("Co gia tri " + x + " trong NODE");
		}
		
	}
	void inCuoi()
	{
		if(head == null)
		{
			System.out.println("Danh Sach Rong");
		}
		else {
			System.out.println("NODE cuoi trong danh sach la: ");
			Node p = head;
			while(p.next != null)
			{
				p = p.next;
			}
			System.out.println(p.data);
		}
	}
	void tbLe()
	{
		double sum = 0;
		int count = 0;
		Node p = head;
		while( p != null)
		{
			if(p.data % 2 == 1)
			{
				sum += p.data;
				count++;
			}
			p = p.next;
		}
		if(count == 0)
		{
			System.out.println("Khong co so le trong NODE!!");
			return;
		}
		System.out.println("Trung binh so le trong NODE la: " + (sum / count));
	}
    
	void themCuoi(int x)
	{
		Node t = new Node(x);
		if(head == null)
		{
			head = t;
		}
		else {
			Node p = head;
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = t;
		}
	}
    
	void insert(int x,int k)
	{
		if(k < 1)
		{
			System.out.println("Vi tri chen khong hop le!!!");
		}else if(k == 1){
			head = new Node(x,head);
		}else {
			int vt = 1;
			Node p = head;
			while(p != null && vt < k-1)
			{
				vt++;
				p = p.next;
			}
			if( p == null)
			{
				System.out.println("Vi tri chen ko hop le");
			}else {
				Node t = new Node(x,p.next);
				p.next = t;
			}
		}
	}
	public static void main(String[] args) {
		MySingleLinkedList link = new MySingleLinkedList();
		link.nhap();
		link.in();
		link.inCuoi();
		link.timX();
		link.tbLe();
		//link.themCuoi(10);
		link.insert(4, 5);
		link.in();
	}


}
