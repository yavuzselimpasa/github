package day01;

public class GitHub_Password_dogrulama {

    // GitHub'da parola doğrulama desteği kaldırıldı nasıl düzeltilir?

    // GitHub'da Erişim Belirteçlerinin nasıl yapılandırılacağını ve kullanılacağını anlama

    /*
        **************giriiş*********************

    Temmuz 2020'de GitHub, kullanıcıların belirli (kimliği doğrulanmış) Git işlemlerini gerçekleştirmek için
  belirteç tabanlı kimlik doğrulama kullanmasını zorunlu kılma niyetini duyurdu .
     Bundan sonra ve 13 Ağustos 2021'den itibaren,
     REST API ile kimlik doğrulaması yapılırken hesap şifreleri artık kabul edilmeyecektir.

     push Örneğin,
    uzak sunucuda parola kimlik doğrulaması yapmaya çalışırsanız,
    işlem aşağıdaki mesajla başarısız olur:
    * Parola doğrulama desteği 13 Ağustos 2021'de kaldırıldı.
    * Lütfen bunun yerine kişisel bir erişim belirteci kullanın

    Son değişiklikler, Git'e komut satırı erişimini ve ayrıca GitHub depolarına doğrudan
    parola kullanımıyla erişen tüm hizmetleri etkiler.
     Öte yandan, iki faktörlü kimlik doğrulamayı zaten etkinleştirdiyseniz,
     belirteç tabanlı bir kimlik doğrulama (veya SSH tabanlı kimlik doğrulama) kullanmanız gerekir
     ve bu nedenle yukarıda belirtilen hatayı görmemelisiniz.

    Bugünün makalesinde, bunu yapmanızı gerektiren Git işlemlerini yürütürken belirteç
    tabanlı kimlik doğrulaması gerçekleştirmenize izin vereceğimiz
    GitHub'da Erişim Belirteçlerini yapılandırmanıza yardımcı olacak hızlı bir adım adım kılavuzdan bahsedeceğiz.

                    Hatayı yeniden oluşturma
     Şimdi bir Git deposu ( ) başlattığınızı git init,
     bazı işler yaptığınızı ve bir taahhüt oluşturduğunuzu
     ve son olarak uzak ana bilgisayarda yapılan değişiklikleri zorlamak istediğinizi varsayalım.
     */

    //git push -U Origin main ' https://github.com'
    // için Kullanıcı Adı : <username> ' https://your-username@github.com'
    // için parola : uzak: Parola doğrulama desteği 13 Ağustos'ta kaldırıldı, 2021.
    // Lütfen bunun yerine kişisel bir erişim belirteci kullanın.
    // uzak: Daha fazla bilgi için lütfen
    // https://github.blog/2020-12-15-token-authentication-requirements-for-git-operations/ adresine bakın .
    // ölümcül: ' https://github.com/<username>/repo-name.git/' için kimlik doğrulama başarısız oldu

    //Parola tabanlı kimlik doğrulama gerçekleştirmeye çalıştığınız göz önüne alındığında,
    // push komutu yukarıda gösterilen kimlik doğrulama ölümcül hatasıyla başarısız olacaktır.
}
