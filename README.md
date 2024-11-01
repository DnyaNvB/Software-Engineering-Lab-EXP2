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
<td width="454">کلاس‌های سرویس مانند TelegramMessageService قابلیت‌های مرتبط با ارسال پیام خاص خود را به طور جداگانه پیاده‌سازی کرده‌اند، که امکان توسعه و افزودن سرویس‌های جدید بدون تغییر مستقیم در کلاس‌های دیگر را فراهم می‌کند. این امر برنامه را توسعه‌پذیرتر می‌کند.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>با افزودن انواع جدید پیام (مانند WhatsAppMessage)، باید کلاس Main برای فراخوانی سرویس جدید به‌روزرسانی شود. این نقض OCP است، زیرا افزودن قابلیت جدید نیازمند تغییر در کد اصلی برنامه است.</td>
</tr>
<tr>
<td rowspan="2">اصل 3<br>Liskov Substitution Principle</td>
<td><strong>موارد تحقق</strong></td>
<td>کلاس TelegramMessageService پیاده‌سازی درستی از رابط MessageService است و به عنوان جایگزینی برای ارسال پیام‌های تلگرام به خوبی کار می‌کند. این پیاده‌سازی به رعایت اصل LSP کمک می‌کند.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>با وجود این‌که TelegramMessageService پیاده‌سازی رابط MessageService را رعایت می‌کند، متدهای خالی `sendSmsMessage` و `sendEmailMessage` در این کلاس نشان‌دهنده نقض LSP است. این متدهای خالی باعث می‌شود که کلاس به درستی نتواند جایگزین MessageService شود و رابطه‌ی as a به درستی برقرار نباشد و باعث پیچیدگی در استفاده از آن می‌شود.</td>
</tr>
<tr>
<td rowspan="2">اصل 4<br>Interface Segregation Principle</td>
<td><strong>موارد تحقق</strong></td>
<td> وجود رابط MessageService به همراه روابط و توابع جداگانه و Specialized برای هر نوع پیام (که البته می‌توانست بهتر هم پیاده‌سازی شود).</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>رابط MessageService شامل متدهای متعدد برای ارسال پیام‌ها است، به طوری که هر کلاس سرویس مجبور به پیاده‌سازی متدهایی است که نیازی به آن‌ها ندارد، مانند `sendSmsMessage` و `sendEmailMessage` در TelegramMessageService. این ساختار نقض ISP است، زیرا کلاس‌ها مجبور به پیاده‌سازی متدهای غیرضروری هستند.</td>
</tr>
<tr>
<td rowspan="2">اصل 5<br>Dependency Inversion Principle</td>
<td><strong>موارد تحقق</strong></td>
<td>کلاس Main به رابط MessageService وابسته است و به جای وابستگی مستقیم به پیاده‌سازی‌های خاص، از انتزاع استفاده می‌کند. این روش با کاهش وابستگی به پیاده‌سازی‌های خاص به رعایت اصل DIP کمک می‌کند.</td>
</tr>
<tr>
<td><strong>موارد نقض</strong></td>
<td>افزودن سرویس‌های جدید هنوز نیاز به تغییر مستقیم در کلاس Main دارد. به عبارت دیگر، کلاس Main به جای استفاده از یک الگوی مناسب مانند کارخانه (Factory) یا تزریق وابستگی (Dependency Injection) برای مدیریت سرویس‌ها، هر سرویس را به صورت دستی مدیریت می‌کند، که باعث نقض کامل اصل DIP می‌شود.</td>
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
