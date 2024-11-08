package Controller;

import QuanLyGiangVien.GUI.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ChuyenManHinh {
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;
    
    public ChuyenManHinh(JPanel jpnRoot){
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(28,38,45)); //70,196,236
        jlbItem.setBackground(new Color(28,38,45));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
                
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node = new TrangChu();
                    break;
                case "GiangVien":
                    node = new GiangVien();
                    break;
                case "Khoa":
                    node = new Khoa();
                    break;
                case "LichDay":
                    node = new LichDay();
                    break;
                case "NCKH":
                    node = new NCKH();
                    break;
                case "HoatDong":
                    node = new HoatDong();
                    break;
                case "PhanQuyen":
                    node = new PhanQuyen();
                    break;
                case "TaiKhoan":
                    node = new TaiKhoan();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
          // setChangeBackGround(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(28,38,45));
            jlbItem.setBackground(new Color(28,38,45));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind))
            jpnItem.setBackground(new Color(28,38,45));
            jlbItem.setBackground(new Color(28,38,45));
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
        /*private void setChangeBackGround(String kind){
            for(DanhMucBean item : listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJpn().setBackground(new Color(70,196,236));
                    item.getJlb().setBackground(new Color(70,196,236));
                } else {
                    item.getJpn().setBackground(new Color(83,82,81));
                    item.getJlb().setBackground(new Color(83,82,81));
                }
            }
        }
*/
}
