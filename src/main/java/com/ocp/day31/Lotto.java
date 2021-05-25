package com.ocp.day31;
public class Lotto {
 private int machineNumber;
 private int lottoNumber;
 private String tname;

    public Lotto(int machineNumber, int lottoNumber, String tname) {
        this.machineNumber = machineNumber;
        this.lottoNumber = lottoNumber;
        this.tname = tname;
    }

    public int getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(int machineNumber) {
        this.machineNumber = machineNumber;
    }

    public int getLottoNumber() {
        return lottoNumber;
    }

    public void setLottoNumber(int lottoNumber) {
        this.lottoNumber = lottoNumber;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Lotto{" + "machineNumber=" + machineNumber + ", lottoNumber=" + lottoNumber + ", tname=" + tname + '}';
    }
 

 
}
