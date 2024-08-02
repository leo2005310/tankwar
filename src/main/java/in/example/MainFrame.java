package in.example;

import javax.swing.*;

public class MainFrame extends JFrame {
   public MainFrame() {
       this.setTitle("坦克大战");
       JMenuBar menuBar = new JMenuBar();//创建菜单栏
       JMenu jMenu = new JMenu("游戏");//创建菜单
       menuBar.add(jMenu);//将菜单栏添加到

       this.setSize(680, 520);//设置面板大小
       this.setResizable(false);//设置不可重置大小
        this.setVisible(true);//设置面板可见
       this.setLocationRelativeTo(null);//设置居中
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可关闭
   }
}
