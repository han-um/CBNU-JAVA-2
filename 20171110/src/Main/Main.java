package Main;

import java.awt.*;
//11
class FrameTest extends Frame
{
	public FrameTest()
	{
		super("두 번째 프레임입니다");
		setBounds(100,100, 300,300);
		setVisible(true);		
	}
}

class PanelTest extends Frame 
{
	public PanelTest(String str) 
	{
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);		
	}
}

class ModelessDialog extends Frame
{
	static final long serialVersionUID = 1;
	public ModelessDialog()
	{
		super("다이얼로그 테스트");
		Dialog d = new Dialog(this, "모덜리스 다이얼로그");
		setBounds(0, 0, 400, 400);
		setVisible(true);
		d.setSize(200, 200);
		d.setVisible(true);
	}
}

class Button1 extends Frame
{
	Button btn1, btn2, btn3;
	public Button1(String str)
	{
		super(str);
		Panel p = new Panel();
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button(" 보 ");
		p.add(btn1); p.add(btn2); p.add(btn3);
		add(p);
		btn3.setEnabled(false);
		setSize(200, 200);
		setVisible(true);
	}
}

class Checkbox1 extends Frame {
	public Checkbox1(String str){
		super(str);
		Panel p = new Panel();
		Checkbox cbx1=new Checkbox("이대",true);
		Checkbox cbx2=new Checkbox("강남");	
		Checkbox cbx3=new Checkbox("종로");
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("이대",group,true);
		Checkbox cbx5=new Checkbox("강남",group,false);	
		Checkbox cbx6=new Checkbox("종로",group,false);
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);

		add(p);
		setSize(180, 300);
		setVisible(true);
	}
}

class ChoiceTest extends Frame 
{
	Choice ch;
	public ChoiceTest(String str)
	{
		super(str);
		ch= new Choice();
		ch.addItem("이대");
		ch.addItem("강남");
		ch.addItem("종로");
		add(ch);
		setSize(300,100);
		setVisible(true);
	}
}

class LabelTest extends Frame {
	Panel p;
	Label label1, label2, label3;
	public LabelTest(String str) {
		super(str);
		p=new Panel();
		label1=new Label("이대");
		label2=new Label("강남", Label.CENTER);
		label3=new Label("종로", Label.LEFT);
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		p.add(label1); 	p.add(label2); 	p.add(label3);
		add(p);
		setSize(300,300);
		setVisible(true);	
	}
}

class FlickeringLabel extends Label implements Runnable{
	public FlickeringLabel(String text) {
		super(text);
		Thread th = new Thread(this);
		th.start();
	}
	
	public void run() {
		int n = 0;
		while(true) {
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n = 1;
			else n = 0;
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

class FlickeringLabelEx extends Frame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		
		FlickeringLabel fLabel = new FlickeringLabel("깜빡");
		Label label = new Label("안깜빡");
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도깜빡");
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		add(p);
		setSize(300, 150);
		setVisible(true);
	}
}

class MenuTest1 extends Frame	{
	public MenuTest1(String str) {
		super(str);
		MenuBar mb = new MenuBar();
		
		Menu file = new Menu("파일");
		MenuItem file_new = new MenuItem("새로 만들기");
		MenuItem file_open = new MenuItem("열기");
		MenuItem file_save = new MenuItem("저장");
		MenuItem file_newname = new MenuItem("저장");
	
		file.add(file_new);
		file.add(file_open);
		file.add(file_save);
		file.add(file_newname);
	
		Menu edit = new Menu("편집");
		MenuItem edit_undo = new MenuItem("실행취소");
		MenuItem edit_cut = new MenuItem("잘라내기");
		MenuItem edit_copy = new MenuItem("복사");
		MenuItem edit_paste = new MenuItem("붙여넣기");
		
		edit.add(edit_undo);
		edit.add(edit_cut);
		edit.add(edit_copy);
		edit.add(edit_paste);
	
		Menu view = new Menu("보기");
		CheckboxMenuItem view_status = new CheckboxMenuItem("상태표시줄");
	
		view.add(view_status);
	
		mb.add(file);
		mb.add(edit);
		mb.add(view);
	
		setMenuBar(mb);
		setSize(200, 200);
		setVisible(true);
	}
}

class BorderLayoutTest1 extends Frame 
{
	public BorderLayoutTest1(String str) 
	{
		super(str);
		setLayout(new BorderLayout());
		add("North", new Button("북쪽"));
		add("West", new Button("서쪽"));
		add("East", new Button("동쪽"));
		add("Center", new Button("중앙"));
		add("South", new Button("남쪽"));

		setSize(200,200);
		setVisible(true);
	}
}

class GridLayoutTest extends Frame
{
	Button btn[] = new Button[6];
	public GridLayoutTest(String str)
	{
		super(str);
		setLayout(new GridLayout(3, 2));
		for(int i =0; i< 6; i++)
		{
			btn[i] = new Button(i+1 + "번 버튼");
			add(btn[i]);
		}
		setSize(200, 200);
		setVisible(true);
	}
}

public class Main
{
	public static void main(String args[])
	{
		//FrameTest Obj =new FrameTest();	
		//new PanelTest("패널 테스트");
		//new ModelessDialog();
		//new Button1("버튼 만들기");
		//new Checkbox1("체크 박스 테스트");
		//new ChoiceTest("콤보 박스 연습");
		//new LabelTest("레이블 테스트");
		//new FlickeringLabelEx();
		//new MenuTest1("메뉴 테스트 1");
		//new BorderLayoutTest1("BorderLayout 예제");
		new GridLayoutTest("Gridlayout Test");
	}
}

