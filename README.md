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
<td width="64">۱</td>
<td width="198">Main</td>
<td width="141">اضافه کردن گزینه ارسال پیام تلگرامی</td>
<td width="292">افزودن یک خط چاپ در منوی اصلی برای انتخاب گزینه ارسال پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۲</td>
<td width="198">Main</td>
<td width="141">افزودن گزینه ارسال پیام تلگرامی به switch</td>
<td width="292">اضافه کردن case جدید (case 3) در ساختار switch برای مدیریت و ایجاد پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۳</td>
<td width="198">Main</td>
<td width="141">تعریف منطق برای ورودی پیام تلگرامی</td>
<td width="292">افزودن منطق برای گرفتن ورودی کاربر و تنظیم مقادیر پیام بر اساس ID یا شماره تلفن در case 3</td>
</tr>

<tr>
<td width="64">۴</td>
<td width="198">Main</td>
<td width="141">افزودن شرط ارسال پیام تلگرامی</td>
<td width="292">اضافه کردن شرط instanceof برای تعیین سرویس مناسب و ارسال پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۵</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف کلاس جدید</td>
<td width="292">ایجاد کلاس جدید TelegramMessage که از Message ارث‌بری می‌کند و حاوی اطلاعات پیام تلگرامی است</td>
</tr>

<tr>
<td width="64">۶</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع getSourcePhoneNumber</td>
<td width="292">ایجاد متدی برای بازگرداندن شماره تلفن مبدأ پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۷</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع setSourcePhoneNumber</td>
<td width="292">ایجاد متدی برای تنظیم شماره تلفن مبدأ پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۸</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع getTargetPhoneNumber</td>
<td width="292">ایجاد متدی برای بازگرداندن شماره تلفن مقصد پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۹</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع setTargetPhoneNumber</td>
<td width="292">ایجاد متدی برای تنظیم شماره تلفن مقصد پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۱۰</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع getSourceId</td>
<td width="292">ایجاد متدی برای بازگرداندن ID مبدأ پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۱۱</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع setSourceId</td>
<td width="292">ایجاد متدی برای تنظیم ID مبدأ پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۱۲</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع getTargetId</td>
<td width="292">ایجاد متدی برای بازگرداندن ID مقصد پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۱۳</td>
<td width="198">TelegramMessage</td>
<td width="141">تعریف تابع setTargetId</td>
<td width="292">ایجاد متدی برای تنظیم ID مقصد پیام تلگرامی</td>
</tr>

<tr>
<td width="64">۱۴</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف کلاس جدید</td>
<td width="292">ایجاد کلاس جدید TelegramMessageService برای مدیریت ارسال پیام‌های تلگرامی</td>
</tr>

<tr>
<td width="64">۱۵</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف تابع sendTelegramMessage</td>
<td width="292">ایجاد متدی برای ارسال پیام تلگرامی که شامل اعتبارسنجی داده‌های ورودی (ID یا شماره تلفن) و چاپ پیامی در صورت صحت اطلاعات است</td>
</tr>

<tr>
<td width="64">۱۶</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف تابع validatePhoneNumber</td>
<td width="292">ایجاد متدی برای بررسی صحت شماره تلفن‌ها (باید ۱۱ رقم و فقط شامل اعداد باشد)</td>
</tr>

<tr>
<td width="64">۱۷</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف تابع validateId</td>
<td width="292">ایجاد متدی برای بررسی صحت ID (باید حداقل ۵ کاراکتر و فقط شامل حروف و اعداد باشد)</td>
</tr>

<tr>
<td width="64">۱۸</td>
<td width="198">MessageService</td>
<td width="141">افزودن تابع جدید sendTelegramMessage</td>
<td width="292">افزودن تابع جدید به واسط MessageService برای ارسال پیام‌های تلگرامی</td>
</tr>

<tr>
<td width="64">۱۹</td>
<td width="198">EmailMessageService</td>
<td width="141">اضافه کردن تابع sendTelegramMessage</td>
<td width="292">افزودن تابع sendTelegramMessage با بدنه خالی به کلاس EmailMessageService برای سازگاری با واسط</td>
</tr>

<tr>
<td width="64">۲۰</td>
<td width="198">SmsMessageService</td>
<td width="141">اضافه کردن تابع sendTelegramMessage</td>
<td width="292">افزودن تابع sendTelegramMessage با بدنه خالی به کلاس SmsMessageService برای سازگاری با واسط</td>
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
