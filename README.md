# SQL Sorgu Alıştırmaları

Bu hafta SQL sorguları üzerine çalışıyorsunuz. Bugünkü alıştırmada sizin için hazırladığımız veritabanında aşağıda istediğimiz sonuçları elde etmenize yarayan SQL sorgularını oluşturacaksınız.

# Proje Kurulumu
Projeyi forklayın ve clonlayın. Tamamladığınızda da pushlayın.

## Kütüphane Bilgi Sistemi

Bu veritabanı, bir okulun kütüphanesinden öğrencilerin aldıkları kitapların bilgisini barındırmaktadır.
* src -> main -> resources altında `test.sql` adında bir doya bulacaksınız.
* `test.sql` dosyasını projeye başlamadan önce kendi veritabanınızda MUTLAKA ÇALIŞTIRMALISINIZ.
* `application.properties` dosyasında `spring.datasource.username` karşısına veritabanını bağlanmak için kullandığınız kullanıcı ismini MUTLAKA GİRİNİZ.
* `application.properties` dosyasında `spring.datasource.password` karşısına veritabanını bağlanmak için kullandığınız şifreyi MUTLAKA GİRİNİZ.


#Tablolar
`ogrenci` tablosu öğrencilerin listesini tutar.
`islem` tablosu öğrencilerin kütüphaneden aldıkları kitapların bilgilerini tutar
`kitap` tablosu kütüphanedeki kitapların bilgisini tutar
`yazar` tablosu kitapların yazarları bilgisini tutar
`tur` tablosu kitapların türlerini tutar.

Tablo ilişiklerini görmek için [ktphn.png] dosyasına göz atın.

Yazdığınız sorguları buradan test edebilirsiniz: [https://ergineer.com/assets/materials/fkg36so5-kutuphanebilgisistemi-sql/] (update, delete, drop sorguları iptal edilmiştir).

### Görevler

Aşağıda istenilen sonuçlara ulaşabilmek için gerekli SQL sorgularını yazmaya çalışacağız.
İlgili sqlleri `OgrenciRepository` ve  `KitapRepository` sınıfı altında tanımlanan `QUESTION` stringlerinin karşısına yazınız.
* 1. soru için sql sonucunu `OgrenciRepository` sınıfının içerisindeki `QUESTION_1` stringinin içerisine yazınız.

	1) Dram ve Hikaye türündeki kitapları listeleyin. JOIN kullanmadan yapın.
	
	2) Kitap alan öğrencilerin öğrenci bilgilerini listeleyin.
	
	3) Kitap almayan öğrencileri listeleyin.
	
	4) 10A veya 10B sınıfındaki öğrencilerin sınıf ve okuduğu kitap sayısını getirin. Büyükten küçüğe sıralayın.
	
	5) Öğrenci tablosundaki öğrenci sayısını gösterin
	
	6) Öğrenci tablosunda kaç farklı isimde öğrenci olduğunu listeleyiniz.
	
	7) İsme göre öğrenci sayılarının adedini bulunuz.
	
	8) Her sınıftaki öğrenci sayısını bulunuz.

	9) Her öğrencinin ad soyad karşılığında okuduğu kitap sayısını getiriniz.
	
	10) Tüm kitapların ortalama puanını bulunuz.



### ⚠️ Skorun NextGen'e Kaydedilmediyse

Eğer testleri çalıştırdığın halde skorun NextGen'e kaydedilmediyse, önce fork'unun güncel olup olmadığını kontrol et:

1. GitHub reponu aç.
2. Repo **X commit ahead** ve **X commits behind** şeklinde bir uyarı gösteriyorsa, branch'in güncel değildir.
3. **Sync fork → Update branch** adımlarını uygula.
4. Ardından localinde şu komutu çalıştır:

```bash
   git pull
```

5. Testleri tekrar çalıştır. Bu adımdan sonra skorun güncellenmiş olacaktır.

> **Not:** Bu kontrolü yapmadan tekrar tekrar test çalıştırmak sorunu çözmez; sorunun kaynağı genellikle fork'un upstream repository ile senkron olmamasıdır.
