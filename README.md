### گام ۲: افزودن یک روش پیام‌رسانی دیگر

تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلام کنید.
- توجه: مواردی که باید به عنوان تغییرات اعلام شوند شامل موارد زیر هستند:
   1. ساخت کلاس جدید
   2. افزودن تابع جدید به کلاس یا واسط (برای توابع جدید صرفاً تغییر را اعلام کنید)
   3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال، اگر سه خط به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزئیات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64"><strong>ردیف</strong></td>
<td width="198"><strong>محل اعمال تغییرات (کلاس/واسط)</strong></td>
<td width="141"><strong>عنوان تغییر</strong></td>
<td width="292"><strong>شرحی کوتاه از تغییر</strong></td>
</tr>
<tr>
<td width="64"><strong>۱</strong></td>
<td width="198">MessageService</td>
<td width="141">افزودن تابع ارسال پیام تلگرامی</td>
<td width="292">افزودن یک تابع void با عنوان sendTelegramMessage</td>
</tr>
<tr>
<td width="64">&nbsp;</td>
<td width="198">&nbsp;</td>
<td width="141">&nbsp;</td>
<td width="292">&nbsp;</td>
</tr>
<tr>
<td width="64">&nbsp;</td>
<td width="198">&nbsp;</td>
<td width="141">&nbsp;</td>
<td width="292">&nbsp;</td>
</tr>
<tr>
<td width="64">&nbsp;</td>
<td width="198">&nbsp;</td>
<td width="141">&nbsp;</td>
<td width="292">&nbsp;</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: .............

### گام ۳: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

در خصوص این برنامه‌ای که نوشته شده و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID (به جز اصل Single Responsibility) موارد نقض یا تحقق هرکدام از اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق یا نقض را نیز به‌صورت کامل توضیح دهید. توجه کنید که برای ارزیابی این بخش، صرفاً کلاس‌های بسته Services و کلاس Main را در نظر بگیرید.
<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">اصل 2<br>Open-Close Principle (OCP)</td>
<td width="95"><strong>موارد تحقق</strong></td>
<td width="454">هر کلاس سرویس (مانند SmsMessageService، EmailMessageService، و TelegramMessageService) به طور جداگانه قابلیت‌های مرتبط با ارسال پیام‌های مختلف را پیاده‌سازی کرده و بدون نیاز به تغییر مستقیم در کلاس‌های دیگر توسعه یافته است. این قابلیت توسعه‌پذیری به نحوی است که امکان افزودن کلاس‌های جدید سرویس وجود دارد.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>هر بار که نوع پیام جدیدی به برنامه اضافه می‌شود (مثلا WhatsApp یا پیام دیگری)، نیاز به تغییر در کلاس Main وجود دارد تا سرویس جدید شناسایی و فراخوانی شود. این نقض OCP است، زیرا برای افزودن قابلیت جدید به سیستم، باید کلاس Main تغییر کند.</td>
</tr>
<tr>
<td rowspan="2">اصل 3<br>Liskov Substitution Principle</td>
<td><strong>موارد تحقق</strong></td>
<td>تمام کلاس‌های سرویس (SmsMessageService، EmailMessageService، و TelegramMessageService) از رابط مشترک MessageService پیروی می‌کنند و هر کدام می‌توانند به عنوان جایگزین برای نوع خاصی از پیام‌ها استفاده شوند. این کار به درستی اصل LSP را رعایت می‌کند.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>وجود متدهای خالی در برخی از پیاده‌سازی‌های MessageService (مانند sendEmailMessage در SmsMessageService و sendTelegramMessage در EmailMessageService) نقض LSP محسوب می‌شود. این متدهای خالی ممکن است به سوء تفاهم یا پیچیدگی در استفاده از این سرویس‌ها منجر شود و نشان‌دهنده این است که بین کلاس‌ها رابطه‌ی as a به درستی رعایت نشده است و یا جایگزینی درستی صورت نگرفته است.</td>
</tr>
<tr>
<td rowspan="2">اصل 4<br>Interface Segregation Principle</td>
<td><strong>موارد تحقق</strong></td>
<td>برای رفع نقض ISP، می‌توان رابط‌های جداگانه برای هر نوع پیام (مانند SmsMessageInterface و EmailMessageInterface) تعریف کرد، که در کد فعلی انجام نشده است.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>رابط MessageService شامل متدهای متعددی برای انواع مختلف پیام است که هر سرویس باید پیاده‌سازی کند، حتی اگر به آن‌ها نیازی نداشته باشد. این نقض اصل ISP است، زیرا هر کلاس سرویس مجبور به پیاده‌سازی متدهای غیرضروری است.</td>
</tr>
<tr>
<td rowspan="2">اصل 5<br>Dependency Inversion Principle</td>
<td><strong>موارد تحقق</strong></td>
<td>کلاس Main به رابط MessageService وابسته است و به جای وابستگی مستقیم به پیاده‌سازی‌های خاص، از یک سطح انتزاعی استفاده می‌کند. این کار به درستی اصل DIP را رعایت می‌کند و کد را انعطاف‌پذیرتر می‌کند.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>با اینکه کلاس Main به رابط MessageService وابسته است، اضافه کردن سرویس‌های جدید همچنان نیازمند تغییر مستقیم در کد کلاس Main است. به عبارت دیگر، کلاس Main به جای استفاده از یک الگوی طراحی مناسب مانند کارخانه (Factory) یا تزریق وابستگی (Dependency Injection) برای مدیریت سرویس‌ها، باید به صورت دستی هر سرویس را ایجاد و مدیریت کند. این موضوع باعث می‌شود که اصل وارونگی وابستگی (DIP) به طور کامل رعایت نشود.</td>
</tr>
</tbody>
</table>


### گام ۴:

در خصوص هرکدام از موارد نقض هر یک از اصول، یک راهکار به منظور رفع آن مشکل ارائه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168"><strong>اصل مربوطه (از اصول SOLID)</strong></td>
<td width="246"><strong>علت نقض</strong></td>
<td width="284"><strong>راه حل پیشنهادی</strong></td>
</tr>
<tr>
<td width="168">&nbsp;</td>
<td width="246">&nbsp;</td>
<td width="284">&nbsp;</td>
</tr>
<tr>
<td width="168">&nbsp;</td>
<td width="246">&nbsp;</td>
<td width="284">&nbsp;</td>
</tr>
<tr>
<td width="168">&nbsp;</td>
<td width="246">&nbsp;</td>
<td width="284">&nbsp;</td>
</tr>
<tr>
<td width="168">&nbsp;</td>
<td width="246">&nbsp;</td>
<td width="284">&nbsp;</td>
</tr>
</tbody>
</table>
