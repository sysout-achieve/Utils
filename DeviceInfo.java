 public class DeviceInfo {
    public String packageVersionCheck(Context context){
        String version = null;
        try {
            PackageInfo i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = i.versionName;
        } catch(PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }   
}


/* 디바이스 정보 
  // 모델 번호
  Build.BOARD
  // 브렌드
  Build.BRAND
  // CPU 정보
  Build.CPU_ABI
  // 디바이스 ( 모델 번호 )
  Build.DEVICE
  // 디스플레이 정보
  Build.DISPLAY
  // -----
  Build.FINGERPRINT
  // IP 주소
  Build.HOST
  // 디바이스 고유 아이디
  Build.ID
  // 제조사
  Build.MANUFACTURER
  // 모델 번호
  Build.MODEL
  // 상품명 ( 모델 번호 )
  Build.PRODUCT
  // ----
  Build.TAGS
  // 유저 타입
  Build.TYPE
  // 사용 유저의 정보
  Build.USER
  // 버전 정보
  Build.VERSION.RELEASE
*/
