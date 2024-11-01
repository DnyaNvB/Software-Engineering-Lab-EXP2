لینک کانبان برد: https://github.com/users/DnyaNvB/projects/2
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
<td width="292">ایجاد متدی برای ارسال پیام پس از صحت‌سنجی</td>
</tr>

<tr>
<td width="64">۱۶</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف تابع verifySourceAndTarget</td>
<td width="292">ایجاد متدی برای بررسی صحیح بودن اطلاعات مبدا و مقصد</td>
</tr>

<tr>
<td width="64">۱۷</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف تابع validatePhoneNumber</td>
<td width="292">ایجاد متدی برای بررسی صحت شماره تلفن‌ها (باید ۱۱ رقم و فقط شامل اعداد باشد)</td>
</tr>

<tr>
<td width="64">۱۸</td>
<td width="198">TelegramMessageService</td>
<td width="141">تعریف تابع validateId</td>
<td width="292">ایجاد متدی برای بررسی صحت ID (باید حداقل ۵ کاراکتر و فقط شامل حروف و اعداد باشد)</td>
</tr>

<tr>
<td width="64">۱۹</td>
<td width="198">TelegramMessageService</td>
<td width="141">اضافه کردن تابع sendEmailMessage</td>
<td width="292">افزودن تابع sendEmailMessage با بدنه خالی به کلاس TelegramMessageService برای سازگاری با واسط</td>
</tr>

<tr>
<td width="64">۲۰</td>
<td width="198">TelegramMessageService</td>
<td width="141">اضافه کردن تابع sendSmsMessage</td>
<td width="292">افزودن تابع sendSmsMessage با بدنه خالی به کلاس TelegramMessageService برای سازگاری با واسط</td>
</tr>

<tr>
<td width="64">۲۱</td>
<td width="198">MessageService</td>
<td width="141">افزودن تابع جدید sendTelegramMessage</td>
<td width="292">افزودن تابع جدید به واسط MessageService برای ارسال پیام‌های تلگرامی</td>
</tr>

<tr>
<td width="64">۲۲</td>
<td width="198">EmailMessageService</td>
<td width="141">اضافه کردن تابع sendTelegramMessage</td>
<td width="292">افزودن تابع sendTelegramMessage با بدنه خالی به کلاس EmailMessageService برای سازگاری با واسط</td>
</tr>

<tr>
<td width="64">۲۳</td>
<td width="198">SmsMessageService</td>
<td width="141">اضافه کردن تابع sendTelegramMessage</td>
<td width="292">افزودن تابع sendTelegramMessage با بدنه خالی به کلاس SmsMessageService برای سازگاری با واسط</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: ۲۳

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
<td width="168">Open-Close Principle (OCP)</td>
<td width="246">هر بار که نوع جدیدی از پیام اضافه می‌شود، لازم است کلاس Main تغییر کند تا سرویس جدید را فراخوانی کند.</td>
<td width="284">باید از الگوی طراحی Factory استفاده کنیم تا با توجه به نوع پیام، سرویس مناسب به صورت خودکار انتخاب شود تا بتوانیم به کلاس Main بدون نیاز به تغییر، سرویس‌های جدیدی اضافه کنیم.</td>
</tr>
<tr>
<td width="168">Liskov Substitution Principle (LSP)</td>
<td width="246">متدهای خالی (مانند sendSmsMessage و sendEmailMessage در TelegramMessageService) نشان می‌دهد که پیاده‌سازی‌ها نمی‌توانند به درستی جایگزین یکدیگر شوند.</td>
<td width="284">به جای اینکه از یک رابط کلی که همه توابع را در خود دارد استفاده کنیم، برای هر نوع پیام یک رابط خاص تعریف کنیم تا هر سرویس فقط توابع مورد نیاز خود را پیاده‌سازی کند تا هر سرویس مستقل و به درستی جایگزین باشد و رابطه‌ی as a به طور کامل برقرار باشد.</td>
</tr>
<tr>
<td width="168">Interface Segregation Principle (ISP)</td>
<td width="246">رابط عمومی MessageService سرویس‌ها را مجبور به پیاده‌سازی متدهایی می‌کند که به آن‌ها نیازی ندارند.</td>
<td width="284">به جای اینکه یک رابط بزرگ و عمومی استفاده کنیم، از رابط‌های کوچک‌تر و تخصصی‌تر برای هر نوع پیام مانند SmsService`، `EmailService و TelegramService استفاده کنیم تا با این‌کار هر سرویس فقط توابع مورد نیاز خود را پیاده‌سازی می‌کند.</td>
</tr>
<tr>
<td width="168">Dependency Inversion Principle (DIP)</td>
<td width="246">کلاس Main به پیاده‌سازی‌های خاص هر سرویس وابسته است و برای افزودن سرویس جدید نیاز به تغییر مستقیم در این کلاس دارد.</td>
<td width="284">به جای ایجاد مستقیم سرویس‌ها در `Main`، از Dependency Injection یا Service Locator استفاده کنیم تا با این‌کار بدون تغییر در کد، سرویس‌های جدید را بتوانیم به Main اضافه کنیم.</td>
</tr>
</tbody>
</table>




### سوالات پایانی:



پرسش اول:

اگر اصول شیءگرایی از ابتدا در پروژه ما به درستی برقرار بود، هنگام اضافه کردن سرویس جدید، بسیاری از تغییرات ثبت شده در جدول مرحله دوم حذف می‌شدند و ما با کد کمتری برای اضافه کردن این قابلیت روبرو می‌شدیم.

1. **حذف تغییرات در Main**: چهار تغییر مهم که شامل اضافه کردن گزینه ارسال پیام تلگرامی به منو، افزودن case جدید در ساختار switch، تعریف منطق برای ورودی پیام تلگرامی، و اضافه کردن شرط instanceof برای ارسال پیام تلگرامی بود، همگی حذف می‌شدند. با رعایت اصول شیءگرایی و استفاده از الگوهای طراحی مناسب، مانند الگوی Factory، ما می‌توانستیم این تغییرات را مدیریت کنیم و کلاس Main را بدون تغییر نگه داریم. این باعث می‌شد که افزودن سرویس‌های جدید به سادگی امکان‌پذیر باشد و نیازی به تغییرات مستقیم در این کلاس نباشد.

2. **حذف متدهای خالی در سرویس‌ها**: متدهای خالی مانند `sendTelegramMessage` در کلاس‌های `EmailMessageService` و `SmsMessageService` نشان‌دهنده نقض اصول SOLID هستند. اگر ما از ابتدا رابط‌های کوچک‌تر و تخصصی‌تر برای هر نوع پیام تعریف کرده بودیم، نیازی به اضافه کردن این متدهای غیرضروری نبود و کلاس‌های سرویس تنها متدهای مرتبط با خود را پیاده‌سازی می‌کردند.

بنابراین، با رعایت اصول شیءگرایی، ما می‌توانستیم **۶ تغییر** از جدول حذف کنیم، و در نهایت سرویس جدید را با **۱۴ تغییر** در سطح کد اضافه کنیم. این امر باعث می‌شد که کد ما ماژولارتر، انعطاف‌پذیرتر، و نگهداری آن ساده‌تر شود.




پرسش دوم:


این اصولی که گفتیم و پیاده‌سازی کردیم، باعث می‌شود که زمانی که بخواهیم یک روش پیام‌رسانی جدید به پروژه اضافه کنیم، اصل OCP رعایت شود و نیازی به تغییر ساختار پیشین کد نباشد. همچنین وابستگی بخش‌های مختلف کد را کاهش دادیم تا اصل DIP رعایت شود و برای اضافه‌کردن بخشی از کد، نیازی به تغییر قسمت‌های دیگر نباشد. با اصلاح نقض اصل LSP دیگر نیازی به override توابع با بدنه‌ی خالی در کلاس جدید نداریم و با رعایت اصل ISP توابع تخصصی و کوچک‌تری تعریف کردیم. با این اصول، تلاش کردیم پروژه را انعطاف‌پذیرتر و قابل نگه‌داری‌تر کنیم، که این ساده‌سازی‌ها به سرعت در پیاده‌سازی کدهای جدید و توسعه‌ی کد کمک زیادی می‌کنند.
