package 倒數計時器;

import 倒數計時器.countDown;
import java.awt.EventQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class countDown extends javax.swing.JFrame {
private int sec = 0;
private int min = 0;
private ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
private ScheduledFuture future;
private int initDelay = 1;
private int delay = 1;
private boolean status = true;
public countDown() {
 initComponents();
}
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addtwotime = new javax.swing.JButton();
        addthreetime = new javax.swing.JButton();
        addonetime = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("00:00");

        addtwotime.setText("2min");
        addtwotime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtwotimeActionPerformed(evt);
            }
        });

        addthreetime.setText("3min");
        addthreetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addthreetimeActionPerformed(evt);
            }
        });

        addonetime.setText("1min");
        addonetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addonetimeActionPerformed(evt);
            }
        });

        stop.setText("stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        start.setText("start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(addtwotime)
                        .addGap(32, 32, 32)
                        .addComponent(addthreetime)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(stop)
                .addGap(141, 141, 141))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(addonetime)
                    .addContainerGap(317, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(start)
                    .addContainerGap(280, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addtwotime, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addthreetime, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(125, Short.MAX_VALUE)
                    .addComponent(addonetime, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(118, 118, 118)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(207, Short.MAX_VALUE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
  future.cancel(!this.future.isCancelled());
    status = true;
    min = 0;
    sec = 0;
    this.jLabel1.setText("00:00");
    }//GEN-LAST:event_stopActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
   if (this.status && this.min > 0) {
      this.status = false;
      Runnable r = new Runnable() {
    public void run() {
         if (countDown.this.min == 0 && countDown.this.sec == 0) {
              countDown.this.status = true;
              countDown.this.future.cancel(!countDown.this.future.isCancelled());
            } 
            if (countDown.this.sec > 0)
              countDown.this.sec = countDown.this.sec - 1; 
            if (countDown.this.min > 0 && countDown.this.sec == 0) {
              countDown.this.min = countDown.this.min - 1;
              countDown.this.sec = 59;
            } 
             countDown.this.labString();
  }
        };
   this.future = this.service.scheduleAtFixedRate(r, this.initDelay, this.delay, TimeUnit.SECONDS);
   
    } 
    }//GEN-LAST:event_startActionPerformed

    private void addonetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addonetimeActionPerformed
 if (this.status) {
      this.min += 1;
      labString();
 } 
    }//GEN-LAST:event_addonetimeActionPerformed

    private void addtwotimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtwotimeActionPerformed
 if (this.status) {
      this.min += 2;
      labString();
 } 
    }//GEN-LAST:event_addtwotimeActionPerformed

    private void addthreetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addthreetimeActionPerformed
 if (this.status) {
      this.min += 3;
      labString();
 } 
    }//GEN-LAST:event_addthreetimeActionPerformed
 
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
          public void run() {
            (new countDown()).setVisible(true);//設定元件的可見性
          }
        });
}
private void labString() {
    if (this.min == 0 && this.sec == 0) {
      this.jLabel1.setText("Time Up");
      return;
    } 
    String mins = String.valueOf(this.min);
    String secs = String.valueOf(this.sec);
    if (this.min < 10)
      mins = "0" + mins; 
    if (this.sec < 10)
      secs = "0" + secs; 
    this.jLabel1.setText(mins + ":" + secs);
}

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addonetime;
    private javax.swing.JButton addthreetime;
    private javax.swing.JButton addtwotime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
