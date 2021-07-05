package aplikimi;

import java.awt.Color;
import javax.swing.JOptionPane;

public class aplikimii extends javax.swing.JFrame {

    public aplikimii() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    boolean gjuha = true;
    int lang = 1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        em = new javax.swing.JLabel();
        emri = new javax.swing.JTextField();
        mb = new javax.swing.JLabel();
        mbiemri = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        ad2 = new javax.swing.JLabel();
        qyteti = new javax.swing.JTextField();
        qy = new javax.swing.JLabel();
        sht = new javax.swing.JLabel();
        sheteti = new javax.swing.JComboBox<>();
        zip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ad1 = new javax.swing.JLabel();
        tl = new javax.swing.JLabel();
        add1 = new javax.swing.JTextField();
        dl = new javax.swing.JLabel();
        Dita = new javax.swing.JComboBox<>();
        muaji = new javax.swing.JComboBox<>();
        viti = new javax.swing.JComboBox<>();
        hyrja = new javax.swing.JComboBox<>();
        numeri = new javax.swing.JTextField();
        llojiEmail = new javax.swing.JComboBox<>();
        np = new javax.swing.JLabel();
        nrpersonal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        skl12 = new javax.swing.JLabel();
        kl12 = new javax.swing.JTextField();
        skl10 = new javax.swing.JLabel();
        kl10 = new javax.swing.JTextField();
        skl11 = new javax.swing.JLabel();
        kl11 = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        ms = new javax.swing.JLabel();
        add4 = new javax.swing.JTextField();
        emsh = new javax.swing.JLabel();
        ko = new javax.swing.JLabel();
        add5 = new javax.swing.JTextField();
        llogmes = new javax.swing.JButton();
        ins = new javax.swing.JLabel();
        fak = new javax.swing.JLabel();
        in = new javax.swing.JComboBox<>();
        fk = new javax.swing.JComboBox<>();
        spec = new javax.swing.JLabel();
        speci = new javax.swing.JComboBox<>();
        passs = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        anu = new javax.swing.JButton();
        NdrroGjuhen = new javax.swing.JButton();
        shm = new javax.swing.JLabel();
        shmp2 = new javax.swing.JLabel();
        piketEmatures = new javax.swing.JComboBox<>();
        komm = new javax.swing.JLabel();
        add6 = new javax.swing.JTextField();
        add7 = new javax.swing.JTextField();
        llojstu = new javax.swing.JLabel();
        lloj1 = new javax.swing.JComboBox<>();
        tl2 = new javax.swing.JLabel();
        hyrja2 = new javax.swing.JComboBox<>();
        pshm = new javax.swing.JComboBox<>();
        shmp = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikimi per bachelor");
        setResizable(false);

        em.setText("Emri:");

        emri.setBackground(java.awt.Color.cyan);

        mb.setText("Mbiemri:");

        mbiemri.setBackground(java.awt.Color.cyan);

        add2.setBackground(java.awt.Color.cyan);

        jLabel3.setText("E-mail");

        email.setBackground(java.awt.Color.cyan);
        email.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N

        ad2.setText("Adresa 2:");

        qyteti.setBackground(java.awt.Color.cyan);

        qy.setText("Qyteti : ");

        sht.setText("Shteti:");

        sheteti.setBackground(java.awt.Color.cyan);
        sheteti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                   ", "Kosov", "Shqiperi", "Maqedoni", "Mal i Zi", "Gjermoni", "Zvicerr" }));

        zip.setBackground(java.awt.Color.cyan);

        jLabel7.setText("Zip Code: ");

        ad1.setText("Adresa 1:");

        tl.setText("Tel:");

        add1.setBackground(java.awt.Color.cyan);

        dl.setText("Data Lindjes:");

        Dita.setBackground(java.awt.Color.cyan);
        Dita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        muaji.setBackground(java.awt.Color.cyan);
        muaji.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        viti.setBackground(java.awt.Color.cyan);
        viti.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        viti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988" }));

        hyrja.setBackground(java.awt.Color.cyan);
        hyrja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "+383", "+355", "+41", "+49", "+377", " " }));

        numeri.setBackground(java.awt.Color.cyan);

        llojiEmail.setBackground(java.awt.Color.cyan);
        llojiEmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "@hotmail.com", "@live.com", "@live.de", "@outlook.com", "@gmail.com", "@icloud.com" }));

        np.setText("Nr. Personal:");

        nrpersonal.setBackground(java.awt.Color.cyan);

        jLabel12.setText("Password:");

        jLabel13.setText("Confirm Password: ");

        pass1.setBackground(java.awt.Color.cyan);

        pass2.setBackground(java.awt.Color.cyan);

        skl12.setText("Suksesi ne kl 12");

        kl12.setBackground(java.awt.Color.cyan);

        skl10.setText("Suksesi ne kl10");

        kl10.setBackground(java.awt.Color.cyan);

        skl11.setText("Suksesi ne kl 11");

        kl11.setBackground(java.awt.Color.cyan);

        mes.setEditable(false);
        mes.setBackground(java.awt.Color.cyan);

        ms.setText("Mesatarja:");

        add4.setBackground(java.awt.Color.cyan);

        emsh.setText("Emri Shkolles Fillore: ");

        ko.setText("Komuna:");

        add5.setBackground(java.awt.Color.cyan);

        llogmes.setBackground(new java.awt.Color(0, 255, 252));
        llogmes.setText("Llogarit Mesataren");
        llogmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llogmesActionPerformed(evt);
            }
        });

        ins.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        ins.setText("Insitucioni");

        fak.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        fak.setText("Fakullteti");

        in.setBackground(java.awt.Color.cyan);
        in.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         ", "UBT", "AAB", "FIEK", "UZK" }));

        fk.setBackground(java.awt.Color.cyan);
        fk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Shkenca kompjuterike", "Inxhinjeri dhe Shkenca Kompjuterike", "Menagjim Biznesi", "Edukim", "Arkitektur", "Psikologji", "Inxhinjeri Elektrike" }));

        spec.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        spec.setText("Specializimi:");

        speci.setBackground(java.awt.Color.cyan);
        speci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                      ", "INXHINIERI E SISTEMEVE SOFTUERIKE", "DATABAZË DHE SISTEME INFORMATIVE", "RRJETET DHE TELEKOMUNIKIMI", "GRAFIKË KOMPJUTERIKE DHE MULTIMEDIA", "WEB PROGRAMIMI" }));

        passs.setBackground(java.awt.Color.green);
        passs.setText("Apliko");
        passs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsActionPerformed(evt);
            }
        });

        jLabel23.setBackground(java.awt.Color.cyan);
        jLabel23.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("                             Te Dhenat                                                                                 Shkollomi                                            Aplikimi                                ");

        anu.setBackground(java.awt.Color.red);
        anu.setText("Anulo");
        anu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuActionPerformed(evt);
            }
        });

        NdrroGjuhen.setBackground(java.awt.Color.magenta);
        NdrroGjuhen.setForeground(java.awt.Color.black);
        NdrroGjuhen.setText("En/Al");
        NdrroGjuhen.setAlignmentY(0.0F);
        NdrroGjuhen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NdrroGjuhen.setFocusCycleRoot(true);
        NdrroGjuhen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NdrroGjuhen.setIconTextGap(2);
        NdrroGjuhen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NdrroGjuhenActionPerformed(evt);
            }
        });

        shm.setText("Shkollimi Mesem:");

        shmp2.setText("Piket e matures:");

        piketEmatures.setBackground(java.awt.Color.cyan);
        piketEmatures.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", " " }));

        komm.setText("Komuna:");

        add6.setBackground(java.awt.Color.cyan);

        add7.setBackground(java.awt.Color.cyan);

        llojstu.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        llojstu.setText("Lloji Studimit");

        lloj1.setBackground(java.awt.Color.cyan);
        lloj1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Studime te rregullta", "Studime me korrespudenc" }));

        tl2.setText("Gjinia");

        hyrja2.setBackground(java.awt.Color.cyan);
        hyrja2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "M", "F", "Tjeter", " " }));
        hyrja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hyrja2ActionPerformed(evt);
            }
        });

        pshm.setBackground(java.awt.Color.cyan);
        pshm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Shkolle profesionale", "Gjimnaz Natyror", "Gjimnaz Shoqeror", " " }));

        shmp.setText("Profili Shkolles Mesme:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(NdrroGjuhen))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(np, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(em, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(dl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hyrja2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hyrja, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numeri, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Dita, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(muaji, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(viti, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emri, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nrpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sht, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qy, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ad1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(llojiEmail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sheteti, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(qyteti, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(add1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(add2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(skl12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(skl11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(skl10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kl12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kl10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kl11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(llogmes, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(komm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shmp2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shmp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(piketEmatures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pshm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emsh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ko, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(speci, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(in, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spec, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(llojstu, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NdrroGjuhen, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(emri, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(nrpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(mbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(muaji, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(viti, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Dita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(hyrja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(numeri, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kl10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kl11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kl12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(llogmes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(skl12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(skl10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(68, 68, 68))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(skl11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)))
                                        .addGap(6, 6, 6)
                                        .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(np, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(mb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(dl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tl2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hyrja2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ad1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ad2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(llojiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sheteti, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qyteti, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(shmp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(piketEmatures, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emsh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGap(228, 228, 228)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(shmp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pshm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(komm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(ins, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fak, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(speci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(llojstu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lloj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passs, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llogmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llogmesActionPerformed
        String nota1 = kl10.getText();
        String nota2 = kl11.getText();
        String nota3 = kl12.getText();
        double n1 = Double.valueOf(nota1);
        double n2 = Double.valueOf(nota2);
        double n3 = Double.valueOf(nota3);
        double rez = (n1 + n2 + n3);
        double tez = (rez / 3);
        String rrez = Double.toString(tez);
        mes.setText(rrez);

    }//GEN-LAST:event_llogmesActionPerformed

    private void passsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passsActionPerformed
        // TODO add your handling code here:
        System.out.println("mir");
        String psw = pass1.getText();
        String mesatarja = mes.getText();
        String psw2 = pass2.getText();
        String emr = emri.getText();
        String mbii = mbiemri.getText();
        int mbiemrii = mbii.length();
        int emrii = emr.length();
        int gjat = psw.length();
        String nrp = nrpersonal.getText();
        int nrpp = nrp.length();
        String mbi = mbiemri.getText();
        String em = email.getText();
        String lloj = llojiEmail.getItemAt(llojiEmail.getSelectedIndex());
        String emaili = email.getText() + lloj;

        if (emrii > 2) {
            emri.setBackground(Color.cyan);
            if (mbiemrii > 2) {
                mbiemri.setBackground(Color.cyan);
                if (nrpp > 9) {
                    nrpersonal.setBackground(Color.cyan);
                    if (emaili.contains("@")) {
                        email.setBackground(Color.cyan);
                        llojiEmail.setBackground(Color.cyan);
                        if (emaili.contains(".com") || emaili.contains(".de") || emaili.contains(".info") || emaili.contains(".net")) {
                            if (gjat > 8 && gjat <= 16) {
                                pass1.setBackground(Color.cyan);
                                if (psw.equals(psw2)) {
                                    pass2.setBackground(Color.cyan);
                                    if (mesatarja.equals("")) {
                                        mes.setBackground(Color.RED);
                                        String str = "plotesoni pjesen e mesatares";
                                        JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
                                        mes.setBackground(Color.cyan);
                                    } else {
                                        String zipppp = zip.getText();
                                        Double zipp = Double.valueOf(zipppp);
                                        int cip;
                                        cip = 2;
                                        if (zipp > 999 && zipp <= 100000) {
                                            cip = 1;
                                        } else {
                                            cip = 2;
                                        }
                                        switch (cip) {
                                            case 1:
                                                String st = "Urime Z/Zn." + mbi + " Aplikimi eshte kryer me sukses ne do ju informojme me detajisht ne kete email: " + em + lloj;
                                                JOptionPane.showMessageDialog(null, st);
                                                emri.setText("");
                                                mbiemri.setText("");
                                                nrpersonal.setText("");
                                                numeri.setText("");
                                                email.setText("");
                                                pass1.setText("");
                                                pass2.setText("");
                                                qyteti.setText("");
                                                zip.setText("");
                                                add1.setText("");
                                                add2.setText("");
                                                kl10.setText("");
                                                kl11.setText("");
                                                kl12.setText("");
                                                mes.setText("");
                                                add4.setText("");
                                                add5.setText("");
                                                Dita.setSelectedIndex(0);
                                                muaji.setSelectedIndex(0);
                                                viti.setSelectedIndex(0);
                                                in.setSelectedIndex(0);
                                                speci.setSelectedIndex(0);
                                                fk.setSelectedIndex(0);
                                                hyrja.setSelectedIndex(0);
                                                sheteti.setSelectedIndex(0);
                                                piketEmatures.setSelectedIndex(0);
                                                lloj1.setSelectedIndex(0);
                                                llojiEmail.setSelectedIndex(0);
                                                break;
                                            case 2:
                                                zip.setBackground(Color.RED);
                                                String str = "Zip Code eshte dhene gabim vlera e tij duhet te jete ne rangun 999 -100000";
                                                JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);

                                        }

                                    }

                                } else {
                                    //else per passwordin ne rubriken e dyte
                                    pass2.setBackground(Color.RED);
                                    String str = "Passwordi Eshte i dhene gabim ne pjesen e dyte";
                                    JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                //else per passworin ne rubriken e pare
                                pass1.setBackground(Color.red);
                                String str = "Gjatesia e passwordit duhet te jete ne mes te 8 deri ne 16 gjatesia e dhene eshte: " + gjat;
                                JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            email.setBackground(Color.RED);
                            llojiEmail.setBackground(Color.RED);
                            String str = "Emaili duhet te permbaj (.com/.de/.info/.net) !";
                            JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        // else per emailinnnnnn
                        email.setBackground(Color.RED);
                        llojiEmail.setBackground(Color.RED);
                        String str = "Emaili duhet te permbaj @ mund ta shkruani ose ta zgjellni ne menyjen renese!";
                        JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    //else per nrpersonal
                    nrpersonal.setBackground(Color.red);
                    String str = "Numri Personal duhet te jet me i gjate se 9 karaktere!";
                    JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                //else per mbiemrin
                mbiemri.setBackground(Color.RED);
                String str = "Mbiemri duhet te jete me i gjate se 2 karaktere!";
                JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            //else per emrin
            emri.setBackground(Color.RED);
            String str = "Emri duhet te jete me i gjate se 2 karaktere!";
            JOptionPane.showMessageDialog(null, str, "Gabim", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_passsActionPerformed

    private void anuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuActionPerformed
        // TODO add your handling code here:
        emri.setText("");
        mbiemri.setText("");
        nrpersonal.setText("");
        numeri.setText("");
        email.setText("");
        pass1.setText("");
        pass2.setText("");
        qyteti.setText("");
        zip.setText("");
        add1.setText("");
        add2.setText("");
        kl10.setText("");
        kl11.setText("");
        kl12.setText("");
        mes.setText("");
        add4.setText("");
        add5.setText("");
        Dita.setSelectedIndex(0);
        muaji.setSelectedIndex(0);
        viti.setSelectedIndex(0);
        in.setSelectedIndex(0);
        speci.setSelectedIndex(0);
        fk.setSelectedIndex(0);
    }//GEN-LAST:event_anuActionPerformed

    private void NdrroGjuhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NdrroGjuhenActionPerformed
        // TODO add your handling code here:

        switch (lang) {
            case 1:
                em.setText("Name: ");
                mb.setText("Surname: ");
                np.setText("Personal NO.: ");
                dl.setText("Bithday: ");
                tl.setText("Phone: ");
                sht.setText("State: ");
                qy.setText("City: ");
                ad1.setText("Addres 1: ");
                ad2.setText("Addres 2: ");
                skl10.setText("Success in the classroom 10: ");
                skl11.setText("Success in the classroom 11: ");
                skl12.setText("Success in the classroom 12: ");
                ms.setText("Average: ");
                emsh.setText("Name of Elementary school: ");
                ko.setText("Municipality: ");
                llogmes.setText("Count Average");
                ins.setText("Institution: ");
                fak.setText("University: ");
                spec.setText("Specialism: ");
                passs.setText("Apply");
                anu.setText("Cancel");
                shm.setText("Hight School Name: ");
                shmp.setText("Hight School profile: ");
                shmp2.setText("Finnaly Example Scores");
                komm.setText("Municipality: ");
                llojstu.setText("Study Type: ");
                lloj1.removeAllItems();
                lloj1.addItem("");
                lloj1.addItem("Regular");
                lloj1.addItem("With correspondence");
                fk.removeAllItems();
                fk.addItem("");
                fk.addItem("Computer science");
                fk.addItem("Engineering and computer science");
                fk.addItem("Business management");
                fk.addItem("Education");
                fk.addItem("Architecture");
                fk.addItem("Psychology");
                fk.addItem("Electrical engineering");
                speci.removeAllItems();
                speci.addItem("");
                speci.addItem("Software Systems Engineer");
                speci.addItem("databases and information systems");
                speci.addItem("Networks and telecommunications");
                speci.addItem("Computer graphics and multimedia");
                speci.addItem("Web Programim");
                lang = 2;
                break;
            case 2:
                em.setText("Emri: ");
                mb.setText("Mbiemri: ");
                np.setText("Nr.Personal: ");
                dl.setText("Data Lindjes: ");
                tl.setText("Tel: ");
                sht.setText("Shteti: ");
                qy.setText("Qyteti: ");
                ad1.setText("Adresa 1: ");
                ad2.setText("Adresa 2: ");
                skl10.setText("Suksesi ne kl10: ");
                skl11.setText("Suksesi ne kl11: ");
                skl12.setText("Suksesi ne kl12: ");
                ms.setText("Mesatarja: ");
                emsh.setText("Emri i shkolles fillore: ");
                ko.setText("Komuna: ");
                llogmes.setText("Llogarit Mesataren: ");
                ins.setText("Instutcioni: ");
                fak.setText("Fakullteti: ");
                spec.setText("Specializimi: ");
                passs.setText("Apliko");
                anu.setText("Anulo");
                shm.setText("Shkollimi Mesme: ");
                shmp.setText("Profili Shkolles Mesme: ");
                shmp2.setText("Piket e matures: ");
                komm.setText("Komuna: ");
                llojstu.setText("Lloji Studimit: ");
                lloj1.removeAllItems();
                lloj1.addItem("");
                lloj1.addItem("Studime te rregullta");
                lloj1.addItem("Studime me Korrespondenc");
                fk.removeAllItems();
                fk.addItem("");
                fk.addItem("Shkenca kompjuterike");
                fk.addItem("Inxhinjeri dhe Shkenva kompjuterike");
                fk.addItem("Menagjim Biznesi");
                fk.addItem("Edukim");
                fk.addItem("Arkitektur");
                fk.addItem("Psikologji");
                fk.addItem("Inxhinjeri Elektrike");
                speci.removeAllItems();
                speci.addItem("");
                speci.addItem("inxhinjeri E sistemeve Softuerike");
                speci.addItem("Databaze dhe sisteme informative ");
                speci.addItem("Rrjete Dhe telekomunikimi");
                speci.addItem("Grafike kompjuterike dhe Multimedia");
                speci.addItem("Web Programim");
                lang = 1;
                break;

        }

    }//GEN-LAST:event_NdrroGjuhenActionPerformed

    private void hyrja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hyrja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hyrja2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikimii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dita;
    private javax.swing.JButton NdrroGjuhen;
    private javax.swing.JLabel ad1;
    private javax.swing.JLabel ad2;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JTextField add4;
    private javax.swing.JTextField add5;
    private javax.swing.JTextField add6;
    private javax.swing.JTextField add7;
    private javax.swing.JButton anu;
    private javax.swing.JLabel dl;
    private javax.swing.JLabel em;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emri;
    private javax.swing.JLabel emsh;
    private javax.swing.JLabel fak;
    private javax.swing.JComboBox<String> fk;
    private javax.swing.JComboBox<String> hyrja;
    private javax.swing.JComboBox<String> hyrja2;
    private javax.swing.JComboBox<String> in;
    private javax.swing.JLabel ins;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField kl10;
    private javax.swing.JTextField kl11;
    private javax.swing.JTextField kl12;
    private javax.swing.JLabel ko;
    private javax.swing.JLabel komm;
    private javax.swing.JButton llogmes;
    private javax.swing.JComboBox<String> lloj1;
    private javax.swing.JComboBox<String> llojiEmail;
    private javax.swing.JLabel llojstu;
    private javax.swing.JLabel mb;
    private javax.swing.JTextField mbiemri;
    private javax.swing.JTextField mes;
    private javax.swing.JLabel ms;
    private javax.swing.JComboBox<String> muaji;
    private javax.swing.JLabel np;
    private javax.swing.JTextField nrpersonal;
    private javax.swing.JTextField numeri;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JButton passs;
    private javax.swing.JComboBox<String> piketEmatures;
    private javax.swing.JComboBox<String> pshm;
    private javax.swing.JLabel qy;
    private javax.swing.JTextField qyteti;
    private javax.swing.JComboBox<String> sheteti;
    private javax.swing.JLabel shm;
    private javax.swing.JLabel shmp;
    private javax.swing.JLabel shmp2;
    private javax.swing.JLabel sht;
    private javax.swing.JLabel skl10;
    private javax.swing.JLabel skl11;
    private javax.swing.JLabel skl12;
    private javax.swing.JLabel spec;
    private javax.swing.JComboBox<String> speci;
    private javax.swing.JLabel tl;
    private javax.swing.JLabel tl2;
    private javax.swing.JComboBox<String> viti;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}
