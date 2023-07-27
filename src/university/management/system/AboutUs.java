package university.management.system;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame {

    AboutUs() {
        setSize(900, 600);
        setLocation(300, 100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about us1.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, -30, 300, 300);
        add(image);
        
        JLabel heading = new JLabel("University Management System");
        heading.setBounds(40, 50, 500, 100);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel abhead = new JLabel("About Us");
        abhead.setBounds(40, 180, 500, 50);
        abhead.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(abhead);
        
        JLabel abpara = new JLabel("<html>Welcome to our University Management System! We are dedicated to providing a comprehensive and efficient platform to manage all aspects of university operations, catering to the needs of students, faculty, staff, and administrators.</html>");
        abpara.setBounds(40, 210, 800, 80);
        abpara.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(abpara);
        
        JLabel vision = new JLabel("Our Vision");
        vision.setBounds(40, 290, 500, 50);
        vision.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(vision);
        
        JLabel visionp = new JLabel("<html>Our vision is to revolutionize university administration by offering a cutting-edge management system that streamlines processes, enhances collaboration, and fosters academic excellence. We strive to empower educational institutions with advanced technology to make informed decisions and optimize resource utilization.</html>");
        visionp.setBounds(40, 320, 800, 80);
        visionp.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(visionp);
        
        JLabel mission = new JLabel("Our Mission");
        mission.setBounds(40, 400, 500, 50);
        mission.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(mission);
        
        JLabel missionp = new JLabel("<html>Our mission is to create an integrated and user-friendly platform that simplifies complex university workflows, promotes data accuracy, and ensures seamless communication between stakeholders. We aim to support academic institutions in achieving their goals of providing quality education and exceptional student experiences.</html>");
        missionp.setBounds(40, 430, 800, 100);
        missionp.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(missionp);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new AboutUs();
    }
}
