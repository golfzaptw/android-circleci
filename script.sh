# ลบ Folder สำหรับรายงานการทดสอบทุกครั้ง เพื่อให้มั่นใจว่าใหม่สดเสมอ
rm -rfv ./reports/android
# สร้าง Folder สำหรับเก็บผลการทดสอบสำหรับแต่ละ Browser
mkdir -p ./reports/android
# กำหนด Option ในการ Run Katalon ในที่นี้
# กำหนดให้เลือก Test Suite ที่เรากำหนดไว้มารัน
katalon_opts='-browserType="Android" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TS_01"'
# สั่งให้ Docker ทำการสร้าง Containner และใช้ Image ที่เรา Pull 
# มาทำการ Run ชุดการทดสอบ
docker run --rm -v $(pwd):/katalon/katalon/source:ro -v $(pwd)/reports/android:/katalon/katalon/report -e KATALON_OPTS="$katalon_opts" katalonstudio/katalon