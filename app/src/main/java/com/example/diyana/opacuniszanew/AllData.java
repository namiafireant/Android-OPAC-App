package com.example.diyana.opacuniszanew;

import java.util.ArrayList;
import java.util.List;

public class AllData {

    List<Acquisition> lstAcquisition;
    ArrayList<Books> lstBooks;
    List<Accession> lstAccession;

    public List<Acquisition> getLstAcquisition() {

        lstAcquisition = new ArrayList<>();
        lstAcquisition.add(new Acquisition("1","23/09/2013", "Badan Cemerlang Sdn. Bhd", "LOCAL ORDER: FULL RECEIPT","0","2","2","0","1"));
        lstAcquisition.add(new Acquisition("2","15/08/2015", "Harmoni Publications & Distributors Sdn. Bhd","LOCAL ORDER: FULL RECEIPT","0","1","1","0","1"));
        lstAcquisition.add(new Acquisition("3","26/11/2011", "Badan Cemerlang Sdn. Bhd", "LOCAL ORDER: FULL RECEIPT","0","2","1","0","3"));
        lstAcquisition.add(new Acquisition("4","31/10/2014", "Harmoni Publications & Distributors Sdn. Bhd","LOCAL ORDER: FULL RECEIPT","0","1","1","0","4"));
        lstAcquisition.add(new Acquisition("5","05/09/2014", "Badan Cemerlang Sdn. Bhd", "LOCAL ORDER: FULL RECEIPT","0","1","1","0","5"));
        lstAcquisition.add(new Acquisition("6","04/03/2013", "Harmoni Publications & Distributors Sdn. Bhd","LOCAL ORDER: FULL RECEIPT","0","1","1","0","6"));
        lstAcquisition.add(new Acquisition("7","18/06/2016", "Badan Cemerlang Sdn. Bhd", "LOCAL ORDER: FULL RECEIPT","0","1","1","0","7"));
        lstAcquisition.add(new Acquisition("8","04/03/2015", "Harmoni Publications & Distributors Sdn. Bhd","LOCAL ORDER: FULL RECEIPT","0","1","1","0","8"));
        lstAcquisition.add(new Acquisition("9","07/12/2015", "Badan Cemerlang Sdn. Bhd", "LOCAL ORDER: FULL RECEIPT","0","1","1","0","9"));
        lstAcquisition.add(new Acquisition("10","04/07/2012", "Harmoni Publications & Distributors Sdn. Bhd","LOCAL ORDER: FULL RECEIPT","0","1","1","0","10"));
        lstAcquisition.add(new Acquisition("11","19/06/2013", "Badan Cemerlang Sdn. Bhd", "LOCAL ORDER: FULL RECEIPT","0","1","1","0","11"));
        lstAcquisition.add(new Acquisition("15","11/3/2008","Rima Enterprise Sdn. Bhd.","LOCAL ORDER: FULL RECEIPT","0","1","1","0","16"));
        lstAcquisition.add(new Acquisition("16","14/09/2010","Koperasi USM Bhd (Cawangan Pantai Timur)","LOCAL ORDER: FULL RECEIPT","0","1","1","0","17"));
        lstAcquisition.add(new Acquisition("17"," 13/09/2007","CERDIK PUBLICATIONS SDN. BHD.","LOCAL ORDER: FULL RECEIPT","0","1","1","0","18"));
        lstAcquisition.add(new Acquisition("18","6/4/2006","Koperasi USM Bhd (Cawangan Pantai Timur)","LOCAL ORDER: FULL RECEIPT","0","2","1","0","29"));
        return lstAcquisition;
    }

    public List<Accession> getLstAccession() {

        lstAccession = new ArrayList<>();
        lstAccession.add(new Accession("1","Q 127 .I74 S27 1977","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","1"));
        lstAccession.add(new Accession("2","Q127.I74 S27","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","1"));
        lstAccession.add(new Accession("3","TX 354 .B47 1980","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","2"));
        lstAccession.add(new Accession("4","Q 125 .N3 1987","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","3"));
        lstAccession.add(new Accession("5","Q 125 .N3 1987","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","3"));
        lstAccession.add(new Accession("6","BP141 .R274 1988","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","2","18/12/2003","11:33:21 AM","6"));
        lstAccession.add(new Accession("7","TK 5105 .5 .A43 2004","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","7"));
        lstAccession.add(new Accession("8","QA 76 .9 .C58 M56 2005","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","8"));
        lstAccession.add(new Accession("9","TK 5105 .55 .P35 2013","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","10"));
        lstAccession.add(new Accession("10","QA 76 .9 .A25 K36 2007","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","11"));
        lstAccession.add(new Accession("15","QK 365 .K6 1988","Tembila Campus","Tembila General Collection","Book"," Open Shelf (30 days)","1","","","15"));
        lstAccession.add(new Accession("16","SB 728.T75 2008","Tembila Campus","Tembila Reference Collection","Book","Reference","1","","","16"));
        lstAccession.add(new Accession("17","QP 801 .P4 P46 2010","Tembila Campus","Tembila General Collection","Book"," Open Shelf (30 days)","1","","","17"));
        lstAccession.add(new Accession("18","TP 248 .25 .B55 A84 1995","Tembila Campus","Tembila General Collection","Book"," Open Shelf (30 days)","1","","","18"));
        lstAccession.add(new Accession("19"," TJ1165 .D92","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","19"));
        lstAccession.add(new Accession("1000034187","QA107 .E3 1979","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","20"));
        lstAccession.add(new Accession("1000034188","QA107 .E3 1979","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","20"));
        lstAccession.add(new Accession("1000034169","QA107 .M37","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","21"));
        lstAccession.add(new Accession("1000034178"," QA107 .M37","Gong Badak Campus","Badak General Sorting","Book","Close Access","3","","","21"));
        lstAccession.add(new Accession("1000040053","TK153 .G76 1985","Gong Badak Campus","Badak General Sorting","Book","Close Access","3","","","22"));
        lstAccession.add(new Accession("1000040054","TK153 .G76 1985","Gong Badak Campus","Badak General Sorting","Book","Close Access","3","","","22"));
        lstAccession.add(new Accession("1000034162","QA107 M373","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","23"));
        lstAccession.add(new Accession("1000036628"," HG4026 .C666","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","24"));
        lstAccession.add(new Accession("1000057747"," HG4026 .C666","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","24"));
        lstAccession.add(new Accession("1000017992","HG4026 .D5","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","25"));
        lstAccession.add(new Accession("1000037114","HG4026 .F52","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","26"));
        lstAccession.add(new Accession("1000018113"," HG4026 .K633","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","27"));
        lstAccession.add(new Accession("20"," HG4027.3 .F53 1987","Gong Badak Campus","Badak Reference Collection","Book","Reference ","1","","","28"));
        lstAccession.add(new Accession("1000105628","HG 106 .S46 2004","Gong Badak Campus","Badak General Collection","Book"," Open Shelf (30 days)","1","","","29"));
        lstAccession.add(new Accession("1000105629","HG 106 .S46 2004","Gong Badak Campus","Badak General Collection","CD-ROM"," Open Shelf (30 days)","1","","","29"));
        lstAccession.add(new Accession("1000027814","LB1576.7 .B35 1989","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","30"));
        lstAccession.add(new Accession("1000034159","QA85 .Z5","Gong Badak Campus","Badak General Collection","Book","Close Access","3","","","31"));
        lstAccession.add(new Accession("1000000595","QA75 .F8612 1993","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","32"));
        lstAccession.add(new Accession("1000032950","T385 .C59","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","33"));
        lstAccession.add(new Accession("1000051332","QA 76 .B743 1991","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","34"));
        lstAccession.add(new Accession("1000051335","QA 76 .C3619 1983","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","35"));
        lstAccession.add(new Accession("1000081924","QA 76 .73 .C153 A83 2000","Tembila Campus","Tembila General Collection","Book","Open Shelf (30 days)","1","","","36"));
        lstAccession.add(new Accession("1000078245","BP130.2 .U8 1998","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","37"));
        lstAccession.add(new Accession("1000086557","BP166.72 .I26 1998","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","38"));
        lstAccession.add(new Accession("1000113432","TX911 .3 .M27 A53 2008","Gong Badak Campus","Badak General Collection","Book","Open Shelf (30 days)","1","","","39"));

        return lstAccession;
    }

    public ArrayList<Books> getLstBooks() {

        lstBooks = new ArrayList<>();
        lstBooks.add(new Books("1","","Q127.I74 S27","Sardar, Ziauddin","Sains teknologi dan pembangunan di dunia Islam / Ziauddin Sardar ; penerjemah, Rahmani Astuti","","Bandung ;: Pustaka, 1989.","viii, 274 ms. ; ; 21 sm","Terjemahan: Science, technology and development in the Muslim world","Mengandungi bibliografi (ms. 244-269) dan indeks","Science -- Islamic countries	Astuti, Rahmani	Science technology and development in the Muslim world","","","2"));
        lstBooks.add(new Books("2","64535320","TX354 .B47","Bennion, Marion, 1925-","The science of food / Marion Bennion","","San Francisco : Harper & Row, c1980.","x, 598 p. : ill. ; 24 cm","","Includes index","Food","","","2"));
        lstBooks.add(new Books("3","1903682401","Q125 .N3 1987","Nasr, Seyyed Hossein, 1933-","Science and civilization in Islam / Seyyed Hossein Nasr","2nd ed","Cambridge: Islamic Texts Society, 1987.","xvi, 388 p. ; 22 cm","Includes bibliographical references (p. 355-365) and index","Science -- Islamic Empire -- History","","","","2"));
        lstBooks.add(new Books("4","9780946621118","","Nasr, Seyyed Hossein, 1933-","Science and civilization in Islam / Seyyed Hossein Nasr","2nd edition","Cambridge: Islamic Texts Society, 2003.","","Includes index","","Islam and science,Science -- History","","","0"));
        lstBooks.add(new Books("5","9789673083855","",	"","Fiqh wanita tentang haji / Muhammad Athiyah Khumais","",": P.Jahabersa, c2012.","","","","","","","0"));
        lstBooks.add(new Books("6","",	"BP141.R274 1988","Rasjid, Sulaiman, 1896-","Fiqh Islam hukum fiqh lengkap / Sulaiman Rasjid","","Kuala Lumpur: Dewan Pustaka Fajar, 1988.","554 p. ; 21 cm","","Includes bibliograpical references (p. 551-552)","Islamic law","","","2"));
        lstBooks.add(new Books("7","71415041","TK5105.5. A43","Albanese, Jason","Network security illustrated / Jason Albanese, Wes Sonnenreich","","New York: McGraw-Hill, c2004.","xxii, 423 p : ill. ; 24 cm","","","Includes index","Computer networks -- Security measures","Sonnenreich, Wes, 1974-","2"));
        lstBooks.add(new Books("8","471687561","QA76.9.C58 M56","Minoli, Daniel, 1952-","A networking approach to grid computing / Daniel Minoli","","Hoboken, NJ: John Wiley, c2005.","xvii, 377 p. : ill. ; 24 cm","Includes bibliographical references (p. 339-351) and index","Computer networks,Computational grids","","","","2"));
        lstBooks.add(new Books("9","9780387765631","",	"","Network planning and traffic engineering",": Springer, 2008.","","","","","","","","0"));
        lstBooks.add(new Books("10","9781111306748","TK5105.55 .P35","Palmer, Michael J., 1948-","Hands-on networking fundamentals / Micheal Palmer","2nd ed","Boston, Massachusetts: Course Technology, Cencage Learning, c2013.","xxii, 663 p. : ill. (some col.) ; 28 cm","Includes index","","Digital communications,Information networks","","","2"));
        lstBooks.add(new Books("11","9789832950462","QA76.9.A25 K36","Kamaruzzaman Seman","Network security an introduction to techniques & standard / Kamaruzzaman Seman, Shaharudin Ismail, Waidah Ismail","","Negeri Sembilan, Malaysia: Penerbit Universiti Sains Islam Malaysia, 2007.","xv, 117 p. : ill. ; 23 cm","","Includes bibliographical references and index","Computer security,Security measures	Waidah","Ismail,Shaharudin Ismail","","2"));
        lstBooks.add(new Books("15","9812040218","QK365 .P6 1988"," Polunin, Ivan","Plants and flowers of Malaysia / Ivan Polunin",""," Singapore : Times Edition, c1988.","159 p. ; ; 23 cm.","","","Flowers -- Malaysia","","","2"));
        lstBooks.add(new Books("16","9788172335182 (hbk.)","SB728 .T75 2008","Tripathi, D. P.","Plant pathology at a glance encyclopedia of plant pathology / D.P.Tripathi","","New Delhi: Scientific Publishers, c2008.","iv, 615 p. : ill. ; 25 cm","","Includes bibliographical references and indexes","Plant diseases","","","2"));
        lstBooks.add(new Books("17"," 0470287217 (cloth)"," QP801.P4 P46 2010","","A computer science tapestry exploring programming and computer science with C++ / Owen L. Astrachan","","Hoboken,NJ: John Wiley, 2010.","xii, 593 p. : ill. ; 25 cm","","Includes bibliographical references and index"," Phenols -- Physiological effect"," Fraga, Cesar G.","","2"));
        lstBooks.add(new Books("18","157808296X"," TP248.27.P55 C533 2003","Chawla, H. S.","Plant biotechnology a practical approach / H. S. Chawla","","Enfield, NH: Science Publishers, c2003.","viii, 302 p. : ill. (some col.) ; 24 cm","","Includes bibliographical references (p. [273]-[275]) and index","Plant biotechnology","","","2"));
        lstBooks.add(new Books("19","70846367","TJ1165 .D92","Dyball, George E.","Mathematics for technician engineers a third-level course / George E. Dyball","","New York : McGraw-Hill, 1980.","358 p. ; ; 23 cm.",""," Includes index","Shop mathematics","","","2"));
        lstBooks.add(new Books("20","201098792","QA107 .E3 1979","Eicholz, Robert E.","Mathematics in our world / Robert E. Eicholz, Phares G. O'Daffer, Charles R. Fleenor","","Menlo Park, Calif. : Addison-Wesley, 1979.","426 p. ; ; 24 cm.","","Arithmetic","","O'Daffer, Phares G.,  Fleenor, Charles R.","","2"));
        lstBooks.add(new Books("21","039518858X","QA107 .M37",""," Mathematics for individual achievement / Richard A. Denholm","","Boston : Houghton Mifflin, 1974."," 340 p. ; ; 25 cm.",""," Arithmetic, Mathematics","","Denholm, Richard A.","","2"));
        lstBooks.add(new Books("22","70249199","TK153 .G76 1985","Grob, Bernard","Mathematics for basic electronics / Bernard Grob","2nd ed.","New York : McGraw-Hill, c1986."," iv, 124 p. ; ; 26 cm.","Nota: Update ed. of: mathematics c1977","Includes index","Electric engineering -- Mathematics","","","2"));
        lstBooks.add(new Books("23","675057450","QA107 M373","","Mathematics for everyday life / Jack Price","","Columbus, Ohio : Merrill, 1982.","466 p. ; ; 24 cm.","","","Mathematics ","Price, Jack","","2"));
        lstBooks.add(new Books("24","91728983","HG4026 .C666","Cooper, Stephen","Financial management / Stephen Cooper; general editors, Emile Woolf","","London: Hutchinson, 1987","505 p. ; 25 cm","","","Corporations -- Finance","","","2"));
        lstBooks.add(new Books("25","906322316"," HG4026 .D5","Dixon, R.","Financial management questions & answers / R. Dixon","","London : Financial Training Publications, 1983.","317 p. ; ; 23 cm.","","Includes index"," Corporations -- Finance","","","2"));
        lstBooks.add(new Books("26","566021757","HG4026 .F52","","Financial management handbook / edited by Jack Broyles, Ian Cooper and Simon Archer","2nd. ed.","Aldershot, England : Gower, c1983..","431 p. ; ; 24 cm.","","Includes bibliography (p. 419) and index","Finance","Cooper, Ian --  Broyles, J. E.","","2"));
        lstBooks.add(new Books("27","673182835","HG4026 .K633","Kolb, Robert W., 1949-","Financial management / Robert W. Kolb","","Glenview, Ill. : Scott, Foresman and Co., 1987.","550 p. ; ; 28 cm.",""," Includes index","Business enterprises -- Finance","","","2"));
        lstBooks.add(new Books("28","566026236","HG4027.3 .F53 1987","","Financial management handbook / edited by Philip A. Vale"," 3rd. ed.","Aldershot, England ;;Brookfield, Vt. : Gower, c1988..","xxii, 395 p. ; ; 24 cm.","","Includes bibliographies and index"," Business enterprises","","","2"));
        lstBooks.add(new Books("29","471267686","HG106 .S46 2004 kit","Sengupta, Chandan","Financial modelling using Excel and VBA / Chandan Sengupta","","Hoboken, NJ: John Wiley & Sons, c2004.","xil, 857 p. : ill. ; 24 cm + 1 CD-ROM (4 3/4 in.)","","Icludes index","Investments -- Mathematical models","","","2"));
        lstBooks.add(new Books("30","131665626","LB1576.7 .B35 1989","Balajthy, Ernest, 1951-","Computer and reading / Ernest Balajthy","","Englewood Cliffs, NJ: Prentice-Hall, c1989.","viii, 248 p. ; ; 23 cm.","","Bibliography: p. 219-240","Language arts -- Computers-assisted Instruction","","","2"));
        lstBooks.add(new Books("31","895170310","QA85 Z5","Ziegler, Michael R."," Computer applications in finite mathematics and calculus / Michael R. Ziegler","","San Francisco ;;Santa Clara, Calif. : Dellen Publishing, 1981.","272 p. ; ; 23 cm.","","","Mathematics -- Computer programs","","","2"));
        lstBooks.add(new Books("32","981302612X","QA75 .F8612 1993","Fuori, William M.","Komputer dan pemprosesan maklumat = Computers and information processing / William M. Fuori, Louis V. Gioia ; diterjemahkan oleh Mardziah Hj Hashim ... [dll.]","","Singapore : Prentice Hall, c1993.","xxiv, 504 p. ; ; 27 sm.","","Terjemahan: Computers and information processing","Electronic data processing","","","2"));
        lstBooks.add(new Books("33","809456621","T385 .C59","","Computer images / by the editors of Time-Life Books","","Alexandria, VA : Time-Life Books, 1986.","128 p.; ; 28 cm.","","Bibliography (p. 124) and index","Computer graphics","","","2"));
        lstBooks.add(new Books("34","805302646","QA76 .B743 1991","Brookshear, J. Glenn","Computer science an overview / J. Glenn Brookshear","3rd ed.","Redwood City, Calif. : Benjamin Cummings, c1991.","viii, 487 p. ; ; 23 cm.","","","Electronic digital computers","","","2"));
        lstBooks.add(new Books("35","471098345","QA76 .C3619","Carver, Keith","Computers and data processing introduction with BASIC / Keith Carver","3rd ed.","New York : John Wiley, c1983.","xiv, 522 p. ; ; 25 cm.","","","Business -- Data processing","","","2"));
        lstBooks.add(new Books("36","72322039","QA76.73.C153 A83 2000","Astrachan, Owen L.","A computer science tapestry exploring programming and computer science with C++ / Owen L. Astrachan","2nd ed","Boston, Mass.: McGraw-Hill, c2000.","xxxi, 848 p. ; 24 cm","","Includes bibliographical references (p. 821-824) and index","C++ (Computer program language)","","","2"));
        lstBooks.add(new Books("37","9832051010","BP130.2 .U8 1998","Ushama, Thameem","Sciences of the Qur'an an analytical study / Thameem Ushama","","Kuala Lumpur: International Islamic University Malaysia Cooperative Limited, 1998.","viii, 430 p. ; 22 cm","","Includes bibliographical references (p. 410-424) and index","Quran -- History","","","2"));
        lstBooks.add(new Books("38","1903682401","Q125 .N32 1987","Nasr, Seyyed Hossein, 1933-","Science and civilisation in Islam / by Seyyed Hossein Nasr","2nd ed","Cambridge: Islamic Texts Society, 1987.","388p. : 1map ; 22cm","","Includes bibliographical references (355-365 p.) and index","Islam and science","","","2"));
        lstBooks.add(new Books("39","946621195","BP166.72 .I26 1998","Ibn Qayyim al-Jawziyah, Muhammad ibn Abi Bakr, 1292-1350","Medicine of the Prophet / Ibn Qayyim Al-Jawziyya, translated by Penelope Johnstone","","Cambridge: Islamic Texts Society, c1998.","xxxii, 318 p. ; 29 cm","","Includes bibliographical references and index","Medicine -- Religious aspects -- Islam -- Early works to 1800","","","2"));
        lstBooks.add(new Books("40","9833455530","Z5351 .S48 2006","Shaharudin Saamin","Medicinal, herbal, aromatic, pesticidal & poisonous plants of Asia and Oceania biodiversity, ethnobotony & pharmacognosy : bibliographic compilation / Shaharudin Saamin","","Serdang: Universiti Putra Malaysia Press, c2006.","xi, 282 p. ; 24 cm","","Includes bibliographical references (p. 266-269) and index","Pesticidal plants -- Oceania -- Bibliography","","","0"));
        return lstBooks;
    }
}
