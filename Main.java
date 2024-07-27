import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entered");

        // Set Look and Feel
        try {
            // Uncomment one of the following lines to set a different Look and Feel
            // UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            System.out.println("Theme set");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        // Define main window (JFrame)
        JFrame mainwindow = new JFrame("SEVEN CHC Setup Assistant 2.0");
        mainwindow.setSize(500, 250);  // Set window size
        mainwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // Set default close operation
        mainwindow.setResizable(false);  // Disable window resizing
        System.out.println("Window defined");

        // Define panels
        JPanel southpanel = new JPanel();
        JPanel centpanel = new JPanel(new GridLayout(6, 2));  // 6 rows, 2 columns grid layout

        // Status label
        JLabel status = new JLabel("Welcome to SEVEN CHC Setup Assistant");
        southpanel.setBackground(Color.white);
        southpanel.add(status);  // Add status label to south panel

        // Part 1: Basic Software
        JLabel part1 = new JLabel("Part 1: Basic Software");
        JButton partb1 = new JButton("Install now");
        partb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Part 1 pressed");
                status.setText("Installing Part 1...");
                partb1.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);  // Simulate installation delay
                        String part1exe = "src\\Part1.exe";
                        ProcessBuilder part1process = new ProcessBuilder("cmd.exe", "/c", "start", part1exe);
                        Process part1proc = part1process.start();
                        int exitCode = part1proc.waitFor();
                        System.out.println("Part 1 completed with exit code: " + exitCode);

                        String part12exe = "src\\BasicSoftware.bat";
                        ProcessBuilder part12process = new ProcessBuilder("cmd.exe", "/c", "start", part12exe);
                        Process part12proc = part12process.start();
                        int exitCode2 = part12proc.waitFor();
                        System.out.println("Part 1.2 completed with exit code: " + exitCode2);
                        status.setText("Part 1 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        // Part 2: Messaging Tools
        JLabel part2 = new JLabel("Part 2: Messaging Tools");
        JButton partb2 = new JButton("Install now");
        partb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Part 2 pressed");
                status.setText("Installing Part 2...");
                partb2.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);  // Simulate installation delay
                        String part2exe = "src\\DMandSocialMedia.bat";
                        ProcessBuilder part2process = new ProcessBuilder("cmd.exe", "/c", "start", part2exe);
                        Process part2proc = part2process.start();
                        int exitCode = part2proc.waitFor();
                        System.out.println("Part 2 completed with exit code: " + exitCode);
                        status.setText("Part 2 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        // Part 3: Developer Tools
        JLabel part3 = new JLabel("Part 3: Developer Tools");
        JButton partb3 = new JButton("Install now");
        partb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Part 3 pressed");
                status.setText("Installing Part 3...");
                partb3.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);  // Simulate installation delay
                        String part3exe = "src\\ProgrammingTools.bat";
                        ProcessBuilder part3process = new ProcessBuilder("cmd.exe", "/c", "start", part3exe);
                        Process part3proc = part3process.start();
                        int exitCode = part3proc.waitFor();
                        System.out.println("Part 3 completed with exit code: " + exitCode);
                        status.setText("Part 3 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        // Part 4: Data Analytics Tools
        JLabel part4 = new JLabel("Part 4: Data Analytics Tools");
        JButton partb4 = new JButton("Install now");
        partb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Part 4 pressed");
                status.setText("Installing Part 4...");
                partb4.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);  // Simulate installation delay
                        String part1exe = "src\\datatools.bat";
                        ProcessBuilder part4process = new ProcessBuilder("cmd.exe", "/c", "start", part1exe);
                        Process part4proc = part4process.start();
                        int exitCode = part4proc.waitFor();
                        System.out.println("Part 4 completed with exit code: " + exitCode);
                        status.setText("Part 4 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        // Quick Install: Office, PDF, Browser
        JLabel quickinstall = new JLabel("Quick install Office, PDF, Browser");
        JButton quickintlalb = new JButton("Install now");
        quickintlalb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Quick install pressed");
                quickintlalb.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);  // Simulate installation delay
                        String part5exe = "src\\QuickInstall.bat";
                        ProcessBuilder part5process = new ProcessBuilder("cmd.exe", "/c", "start", part5exe);
                        Process part5proc = part5process.start();
                        int exitCode = part5proc.waitFor();
                        System.out.println("Quick install completed with exit code: " + exitCode);
                        status.setText("Quick install completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        // Additional: Software Updates and More
        JLabel deleteall = new JLabel("Software Updates and More");
        JButton removeallb = new JButton("Open");
        removeallb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("More Apps pressed");
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);  // Simulate installation delay
                        String part6exe = "src\\PatchMyPC.exe";
                        ProcessBuilder part6process = new ProcessBuilder("cmd.exe", "/c", "start", part6exe);
                        Process part6proc = part6process.start();
                        int exitCode = part6proc.waitFor();
                        System.out.println("Part 6 completed with exit code: " + exitCode);
                        status.setText("Apps Update and More completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        // Add components to center panel
        centpanel.add(part1);
        centpanel.add(partb1);
        centpanel.add(part2);
        centpanel.add(partb2);
        centpanel.add(part3);
        centpanel.add(partb3);
        centpanel.add(part4);
        centpanel.add(partb4);
        centpanel.add(quickinstall);
        centpanel.add(quickintlalb);
        centpanel.add(deleteall);
        centpanel.add(removeallb);

        // Create menubar
        JMenuBar menu1 = new JMenuBar();
        JMenu file = new JMenu("File");

        // Refresh agent menu item
        JMenuItem refresh = new JMenuItem("Refresh agent");
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partb1.setEnabled(true);
                partb2.setEnabled(true);
                partb3.setEnabled(true);
                partb4.setEnabled(true);
                quickintlalb.setEnabled(true);
                removeallb.setEnabled(true);
                status.setText("Agent refreshed");
                System.out.println("Agent refreshed");
            }
        });

        // Exit menu item
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Help menu
        JMenu help = new JMenu("Help");

        // About menu item
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "SEVEN CHC Setup Assistant 2.0\n" +
                        "Created by Seven IT Department\nCopyright 2024-2025", "About Setup Assistant", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Paid Software menu item
        JMenuItem propsoft = new JMenuItem("Paid Software");
        propsoft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Paid software such as Microsoft Office, Adobe Acrobat etc. can be requested" +
                        " via the Seven IT Service Hub.\nBy default, this program will not install any software which" +
                        " requires a license.","Paid Software Help",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Help & More menu item
        JMenuItem moresoft = new JMenuItem("Help & More");
        moresoft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URI sevenithub = new URI("http://localhost/itservice.sevenchc.com");
                    java.awt.Desktop.getDesktop().browse(sevenithub);
                } catch (URISyntaxException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // Add menu items to help menu
        help.add(moresoft);
        help.add(propsoft);
        help.add(about);

        // Add menu items to file menu
        file.add(refresh);
        file.add(exit);

        // Add menus to menu bar
        menu1.add(file);
        menu1.add(help);

        // Add panels to main window
        mainwindow.getContentPane().add(BorderLayout.SOUTH, southpanel);
        mainwindow.getContentPane().add(BorderLayout.NORTH, menu1);
        mainwindow.getContentPane().add(BorderLayout.CENTER, centpanel);

        // Make the window visible
        mainwindow.setVisible(true);
    }
}
