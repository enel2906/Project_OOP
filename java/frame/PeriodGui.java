package frame;

import editstring.*;
import models.King;
import models.Era;
import screen.*;
import com.google.gson.Gson;
import button.AestheticButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PeriodGui extends JFrame {
    private Era period;

    private JPanel contentPane;

    /**
     * Launch the application.
     */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					KingGui1 frame = new KingGui1(king);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

    public PeriodGui(Era period) {
        this.period = period;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1113, 669);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        setAutoRequestFocus(false);
        setBackground(new Color(240, 240, 240));
        getContentPane().setBackground(Color.WHITE);
        setSize(new Dimension(929, 520));
        setResizable(true);
        setPreferredSize(new Dimension(21, 11));
        setTitle("TRIEUDAI");
        getContentPane().setLayout(null);

        AestheticButton btnNewButton_4 = new AestheticButton("NHÂN VẬT LỊCH SỬ");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FiguresSearch nv = new FiguresSearch();
                dispose();
                nv.show();
            }
        });
        btnNewButton_4.setFont(new Font("Playfair Display", Font.BOLD, 12));
        btnNewButton_4.setBounds(59, 79, 212, 46);
        btnNewButton_4.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        btnNewButton_4.setBackground(Color.WHITE);
        getContentPane().add(btnNewButton_4);


        AestheticButton btnNewButton = new AestheticButton("ĐỊA DANH");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiteSearch dd = new SiteSearch();
                dispose();
                dd.show();
                //dispose();
            }
        });
        btnNewButton.setFont(new Font("Playfair Display", Font.BOLD, 12));
        btnNewButton.setBounds(59, 135, 212, 46);
        getContentPane().add(btnNewButton);

        AestheticButton btnNewButton_1 = new AestheticButton("LỄ HỘI VĂN HÓA");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FesSearch lh = new FesSearch();
                dispose();
                lh.show();
                //dispose();
            }
        });
        btnNewButton_1.setBounds(59, 191, 212, 46);
        btnNewButton_1.setFont(new Font("Playfair Display", Font.BOLD, 12));
        getContentPane().add(btnNewButton_1);

        AestheticButton btnNewButton_5 = new AestheticButton("THOÁT");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_5.setBounds(59, 416, 212, 46);
        btnNewButton_5 .setFont(new Font("Playfair Display", Font.BOLD, 12));
        getContentPane().add(btnNewButton_5);

        AestheticButton btnNewButton_6 = new AestheticButton("VUA\r\n");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                KingSearch king = new KingSearch();
                dispose();
                king.show();
                //dispose();
            }
        });
        btnNewButton_6.setBounds(59, 247, 212, 46);
        btnNewButton_6.setFont(new Font("Playfair Display", Font.BOLD, 12));
        getContentPane().add(btnNewButton_6);

        AestheticButton btnNewButton_3 = new AestheticButton("TRANG CHỦ\r\n");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HomeScreen ab = new HomeScreen();
                dispose();
                ab.show();
                //dispose();
            }
        });
        btnNewButton_3.setBounds(59, 23, 212, 46);
        btnNewButton_3.setFont(new Font("Playfair Display", Font.BOLD, 12));
        getContentPane().add(btnNewButton_3);

        AestheticButton btnNewButton_7 = new AestheticButton("TRIỀU ĐẠI\r\n");
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PeriodsSearch td = new PeriodsSearch();
                dispose();
                td.show();
                //dispose();
            }
        });
        btnNewButton_7.setBounds(59, 303, 212, 46);
        btnNewButton_7.setFont(new Font("Playfair Display", Font.BOLD, 12));
        getContentPane().add(btnNewButton_7);

        AestheticButton btnNewButton_8 = new AestheticButton("SỰ KIỆN\r\n");
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WarSeach sk = new WarSeach();
                dispose();
                sk.show();
                //dispose();
            }
        });
        btnNewButton_8.setBounds(59, 359, 212, 46);
        btnNewButton_8.setFont(new Font("Playfair Display", Font.BOLD, 12));
        getContentPane().add(btnNewButton_8);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("src\\main\\resources\\Pictures\\giaoan.lik-trong-dong.png"));
        lblNewLabel_1.setBounds(-34, 0, 409, 490);
        getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("src\\main\\resources\\Pictures\\giphy.jpg"));
        lblNewLabel.setBounds(0, 0, 375, 500);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("Triều đại: " + period.getEra());
        lblNewLabel_2.setBounds(384, 96, 479, 85);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_5 = new JLabel("Thời kỳ: " + period.getPeriod());
        lblNewLabel_5.setSize(479, 96);
        lblNewLabel_5.setLocation(385, 191);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Thời gian: " + period.getTime());
        lblNewLabel_6.setSize(503, 102);
        lblNewLabel_6.setLocation(385, 276);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Vua: ");
        JPanel linkKing = new JPanel(new FlowLayout(FlowLayout.LEFT));
        linkKing.setBounds(385,388,503,85);
        linkKing.add(lblNewLabel_7);
        linkKing.setBackground(Color.WHITE);
        for(String vua : period.getKings()){
            String strVua = vua + ",\n";
            if(findKing(vua) == null){
                JLabel kingl = new JLabel(strVua);
                linkKing.add(kingl);
            }else{
                JLabel kingl = new JLabel("<html><span style=\"color: blue; text-decoration: underline;" +
                        " cursor: pointer;\">"+ strVua + "</span></html>");
                linkKing.add(kingl);
                kingl.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dispose();
                        KingGui king = new KingGui(findKing(vua));
                        king.setVisible(true);
                    }
                });
            }
        }
        contentPane.add(linkKing);
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("src\\main\\resources\\Pictures\\unnamed.jpg"));
        lblNewLabel_3.setBounds(693, 10, 198, 83);
        contentPane.add(lblNewLabel_3);


    }

    public King findKing(String str){
        File folder = new File("src\\main\\resources\\Json\\Kings");
        File[] fileList = folder.listFiles();
        King king = null;
        Gson gson = new Gson();
        int count = 0;

        stringEdit s = new stringEdit();

        for(File file : fileList){
            try{
                String content = new String(Files.readAllBytes(file.toPath()));
                King vua = gson.fromJson(content, King.class);
                if(s.compareString(str, vua.getName())==1){
                    king = vua;
                    return king;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        return king;

    }
}
