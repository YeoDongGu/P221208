package java6.p52;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest extends WindowAdapter implements ActionListener {
	private FileDialog fileOpen;
	private Frame f;
	private MenuBar mb;
	private Menu mFile;
	private Menu mTemp;
	private Menu mEdit;
	private Menu mView;
	private Menu mHelp;
	private Menu mJoom;
	private MenuItem miNew2;
	private MenuItem miNew;
	private MenuItem miOpen;
	private MenuItem miSave;
	private MenuItem miOtherSave;
	private MenuItem miPage;
	private MenuItem miPrint;
	private MenuItem miExit;
	private MenuItem miJoomIn;
	private MenuItem miJoomOut;
	private MenuItem miJoomDefault;
	private MenuItem miLineCh;
	private MenuItem miFont;
	private MenuItem miHelpView;
	private MenuItem miFeedback;
	private MenuItem miInf;

	private MenuItem miCan;
	private MenuItem miCut;
	private MenuItem miCopy;
	private MenuItem miPaste;
	private MenuItem miLos;
	private MenuItem miBing;
	private MenuItem miFind;
	private MenuItem miNextf;
	private MenuItem mibeforef;
	private MenuItem miChange;
	private MenuItem miMove;
	private MenuItem miSelectAll;
	private MenuItem miDate;

	private MenuItem miStat;

	public MenuTest() {
		f = new Frame("Parent");
		f.setSize(500, 500);

		fileOpen = new FileDialog(f, "File Open", FileDialog.LOAD);
		fileOpen.setDirectory("C:\\Windows");

		mb = new MenuBar();
		mFile = new Menu("파일(F)");
		miNew2 = new MenuItem("새로만들기(N)");
		miNew = new MenuItem("새 창(W)");
		miOpen = new MenuItem("열기(O)...");
		miSave = new MenuItem("저장(S)");
		miOtherSave = new MenuItem("다른이름으로저장(A)...");
		miPage = new MenuItem("페이지 설정(U)...");
		miPrint = new MenuItem("인쇄(P)...");
		miExit = new MenuItem("끝내기(X)");

		mEdit = new Menu("편집(E)");
		miCan = new MenuItem("실행 취소(U)");
		miCut = new MenuItem("잘라내기(T)");
		miCopy = new MenuItem("복사(C)");
		miPaste = new MenuItem("붙여넣기(P)");
		miLos = new MenuItem("삭제(L)");
		miBing = new MenuItem("Bing으로 검색(S)...");
		miFind = new MenuItem("찾기(F)...");
		miNextf = new MenuItem("다음 찾기(N)");
		mibeforef = new MenuItem("이전 찾기(V)");
		miChange = new MenuItem("바꾸기(R)...");
		miMove = new MenuItem("이동(G)...");
		miSelectAll = new MenuItem("모두 선택(A)");
		miDate = new MenuItem("시간/날짜(D)");

		mTemp = new Menu("서식(O)");
		miLineCh = new MenuItem("자동 줄 바꿈(W)");
		miFont = new MenuItem("글꼴(F)...");

		mView = new Menu("보기(V)");
		mJoom = new Menu("확대하기/축소하기");
		miJoomIn = new MenuItem("확대(I)");
		miJoomOut = new MenuItem("축소(O)");
		miJoomDefault = new MenuItem("확대하기/축소하기 기본값 복원");
		miStat = new MenuItem("상태 표시줄(S)");

		mHelp = new Menu("도움말(H)");
		miHelpView = new MenuItem("도움말 보기(H)");
		miFeedback = new MenuItem("피드백 보내기(F)");
		miInf = new MenuItem("메모장 정보(A)");

		mFile.add(miNew2);
		mFile.add(miNew);
		MenuShortcut ms = new MenuShortcut(KeyEvent.VK_N);
		miNew2.setShortcut(ms);
		mFile.add(miOpen);
		MenuShortcut ms2 = new MenuShortcut(KeyEvent.VK_O);
		miOpen.setShortcut(ms2);
		mFile.add(miSave);
		MenuShortcut ms3 = new MenuShortcut(KeyEvent.VK_S);
		miSave.setShortcut(ms3);
		mFile.add(miOtherSave);
		mFile.addSeparator();
		mFile.add(miPage);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(miExit);

		mEdit.add(miCan);
		mEdit.add(miCut);
		mEdit.add(miCopy);
		mEdit.add(miPaste);
		mEdit.add(miLos);
		mEdit.add(miBing);
		mEdit.add(miFind);
		mEdit.add(miNextf);
		mEdit.add(mibeforef);
		mEdit.add(miChange);
		mEdit.add(miMove);
		mEdit.add(miSelectAll);
		mEdit.add(miDate);

		mTemp.add(miLineCh);
		mTemp.add(miFont);

		mView.add(mJoom);
		mJoom.add(miJoomIn);
		mJoom.add(miJoomOut);
		mJoom.add(miJoomDefault);
		mView.add(miStat);

		mHelp.add(miHelpView);
		mHelp.add(miFeedback);
		mHelp.addSeparator();
		mHelp.add(miInf);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mTemp);
		mb.add(mView);
		mb.setHelpMenu(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);

		// action
		f.addWindowListener(this);
		mEdit.addActionListener(this);
		mHelp.addActionListener(this);
		mFile.addActionListener(this);
		miOpen.addActionListener(this);
		miExit.addActionListener(this);
		miPrint.addActionListener(this);

		mView.addActionListener(this);
		miLineCh.addActionListener(this);
		miFont.addActionListener(this);
		miNew.addActionListener(this);
		mTemp.addActionListener(this);
		miHelpView.addActionListener(this);
		miJoomDefault.addActionListener(this);
		miJoomOut.addActionListener(this);
		miJoomIn.addActionListener(this);
		miFeedback.addActionListener(this);
		miInf.addActionListener(null);

	}

	public static void main(String[] args) {
		new MenuTest();
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("열기(O)...")) {
			fileOpen.setVisible(true);
		} else if (e.getActionCommand().equals("끝내기(X)")) {
			System.exit(0);
		}
	}

}
