# Servlet-JspAndJpa

#Açıklama

Servlet&Jsp nedir?

Java Server Pages dinamik bir web programlama dili. Java Web tarafında bu dinamik yapıyı Servlet’ler ile karşılamakta. İşin özeti sadece bu.
Servlet’ler Java dünyasının bir parçasıdır. Nesnesidir. Bir kod bloğunu Java binary kod’lara çevirmeden hemen önceki halidir Servlet. O zaman Java Server Pages ile programımız derlenirken ilk olarak Servlet’e çevrilmekte.
Servlet’ler’i istemci ile servlet’ler arasında iletişimini sağlayan Servlet Motor’rları vardır. Bu motorlar dan bir örnek verecek olursam daha önce blog’um da yazdığım Apache Tomcat‘dir. Kullanıcıya sunulan Web sayfalarını önümüze getirir ve isteklerimize cevap verir.
Servlet ve Servlet Motorlarının çalışma işlemini yakından incelemeye başladığımda dikkatimi çeken bir nokta oldu. O nokta multi thread çalışma sistemi var Servlet Motorlarının. Bu noktaya sadece değinmek istedim.
Anlatılmak istediğim durumu resim kısaca özetlemektedir. Biz ister JSP ister JSF ile kodlama yapalım hepsi Servlet’e dönüşüp ve Servlet Motoru’na  istemleri yapmaktadır.

Tasarım için Bootstrap kullanılmıştır.

--Uygulama Gereksinimleri ve POM Dosyası--

Servlet ile yazacağımız uygulamamız, Name,Surname ve Salary bilgileri alınmış olup üye kaydı sağlanmıştır. Sonra da tablodaki tüm üye listeleri gösterilmiştir.

Proje de MySQL workbench de veritabanı hazırlanmıştır. Hazırlanan veritabanının ismi schema dir. İstenildiği taktirde META-INF/persistence.xml dosyasından veritabanı ismi değiştirilebilir. Bu dosyada jsp, mysql ve hibernate konfigürasyonları bulunmaktadır.

Hibernate konfigürasyonu kullanılarak veritabanında tablonun oluşması kolaylaştırılmıştır. Aynı zamanda tablo içinde Column ların içi sql kodlarının karşmaşıklığından kurtulup Hibernate orm mantığıyla rahatlıkla doldurulmuştur.

ORM nedir?

ORM, Object Relational Mapping anlamına gelmektedir. O/R Mapping olarakta yazılabilir. ORM nedir diye bir soru soracak olursak şöyle bir cevap verebiliriz: “İlişkisel veritabanı (RDBMS) ile nesneye yönelik programlanın (OO) arasında bir tür köprü özelliği gören ve ilişkisel veritabanındaki bilgilerimizi yönetmek için, nesne modellerimizi kullandığımız bir tekniktir/metodtur”. Basite indirgemek istersek: “Nesnelerimizi ilişkisel veritabanındaki tablomuza bağlayan ve veri alış-verişini bizim için yapan bir tekniktir/metodtur”. ORM tekniği belli bir programlama diline bağlı değildir ve her OO dilinde yazılabilir/kullanılabilir.

#Not

Proje Maven ile hazırlanmıştır.

Proje indirildikten sonra IDE'ye maven projesi olarak import edilip maven clean ve install komutları çalıştırılmalıdır. Gerekirse maven update yapılmalıdır. En son employee.jsp run edilmelidir.

Proje çalıştırılınca browserdan; http://localhost:8080/Servlet&JspAndJpa/employee.jsp adresinden CRUD işlemlerine başlayabilirsiniz.
