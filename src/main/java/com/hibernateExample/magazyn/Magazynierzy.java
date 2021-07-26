package com.hibernateExample.magazyn;

import javax.persistence.*;

/*use ZarzMagaz
go
create  table Magazynierzy(
	magazynierzy_id int primary key IDENTITY(1,1)  NOT NULL
	,magazynierzy_nazwisko varchar(255) NULL
	,magazynierzy_nr varchar(255) NULL
	,regaly_id int NULL
	,programyTypy_id int NULL
	,dostawcy_id int NULL
	,kupcy_nazwa varchar(255) NULL
	,organizacja_id int NULL
	,rodzajeTowarow_id int NULL
	)
*/

@Entity
public class Magazynierzy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "magazynierzy_id")
    private Integer mag_id;
    @Column(name = "magazynierzy_nazwisko")
    private String mag_nazwisko;
    @Column(name = "magazynierzy_nr")
    private String mag_nr;


    public Magazynierzy() {
    }

    public Magazynierzy(String mag_nazwisko, String mag_nr) {
        this.mag_nazwisko = mag_nazwisko;
        this.mag_nr = mag_nr;
    }

     public Integer getMag_id() {
        return mag_id;
    }

    public void setMag_id(Integer mag_id) {
        this.mag_id = mag_id;
    }

    public String getMag_nazwisko() {
        return mag_nazwisko;
    }

     public void setMag_nazwisko(String mag_nazwisko) {
        this.mag_nazwisko = mag_nazwisko;
    }

     public String getMag_nr() {
        return mag_nr;
    }

    public void setMag_nr(String mag_nr) {
        this.mag_nr = mag_nr;
    }

    @Override
    public String toString() {
        return "Magazynierzy{" +
                "mag_id=" + mag_id +
                ", mag_nazwisko='" + mag_nazwisko + '\'' +
                ", mag_nr='" + mag_nr + '\'' +
                '}';
    }
}
