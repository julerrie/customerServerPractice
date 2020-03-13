package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		/// 社番番号
	    private String s_MeterNo;
	    /// 即検針日
	    private String s_SokuDate;
	    /// ガスメータ設置場所番号
	    private String s_GasSecchi;
	    /// 検針順序番号
	    private String s_KenSeq;
	    /// 行政区画コード
	    private String s_GyoseiCd;
	    /// 号番号
	    private String s_GouBan;
	    /// 検針票表示名漢字（Null許容）
	    private String s_NameJ;
	    /// 検針票表示名カナ（Null許容）
	    private String s_NameC;
	    /// 町名・漢字
	    private String s_MachiJ;
	    /// 丁目ー番地ー号（１）
	    private String s_Adrs1;
	    /// 丁目ー番地ー号（２）（Null許容）
	    private String s_Adrs2;
	    /// 丁目ー番地ー号（３）（Null許容）
	    private String s_Adrs3;
	    /// 建物番号
	    private String s_TatemoN;
	    /// 建物名漢字（Null許容）
	    private String s_AptJ;
	    /// 棟番カナ（Null許容）
	    private String s_AptMeiC2;
	    /// 部屋番カナ（Null許容）
	    private String s_AptMeiC3;
	    /// 店名・屋号漢字（Null許容）
	    private String s_YagoJ;
	    /// 検針方法コード
	    private String s_HohoCd;
	    /// 無線有無コード
	    private String s_MusenFlg;
	    /// 自動検針エラーコード
	    private String s_JiErrCd;
	    /// 自動検針はこ配布コード
	    private String s_JiHaifuCd;
	    /// ガスメータ開閉栓状態コード
	    private String s_UseCd;
	    /// ガス料金契約種別コード
	    private String s_KeiyakuType;
	    /// DM拒否
	    private String s_Dmrej;
	    /// 登録内容ミクス（５）（検針時留意情報）（Null許容）
	    private String s_TorokuMix5;
	    /// サービス留意内容（１）（DM・チラシ拒否情報）（Null許容）
	    private String s_RyuiNaiyo1;
	    /// 重要度高メモ（Null許容）
	    private String s_JuyoHmemo;
	    /// 重要度低メモ（Null許容）
	    private String s_JuyoLmemo;
	    /// ガスメータ取付位置コード
	    private String s_IchiCd;
	    /// 検針道順コード（Null許容）
	    private String s_MichiCd;
	    /// 検針可能時刻（開始）（Null許容）
	    private String s_PossStart;
	    /// 検針可能時刻（終了）（Null許容）
	    private String s_PossEnd;
	    /// 検針可能曜日（Null許容）
	    private String s_PossWeek;
	    /// 暗証番号前（Null許容）
	    private String s_PrevChr;
	    /// 暗証番号（Null許容）
	    private String s_LockNo;
	    /// 暗証番号後（Null許容）
	    private String s_AftrChr;
	    /// マンションメモ
	    private String s_Man;
	    /// 検針実施状況コード（Null許容）
	    private String s_JokyoCd;
	    /// 検針完了コード
	    private String s_CompCd;
	    /// ガスメータ号数流量
	    private String s_MeterGou;
	    /// ガスメータ形式記号
	    private String s_MeterKata;
	    /// 指示数表示桁数
	    private String s_MeterKeta;
	    /// 指示数最小値
	    private String s_MinShiji;
	    /// 前回ガスメータ指示数（Null許容）
	    private String s_OldShiji;
	    /// 今回ガスメータ指示数（Null許容）
	    private String s_Shiji;
	    /// 今回ガス使用量（Null許容）
	    private String s_ShiyouRyo;
	    /// 取外指示数（Null許容）
	    private String s_HazusiSijisu;
	    /// 取付指示数（Null許容）
	    private String s_TsukeSijisu;
	    /// 客検参照ガスメータ指示数（Null許容）
	    private String s_KyakuShiji;
	    /// 客検参照年月日（Null許容）
	    private String s_KyakuDate;
	    /// 前回使用量（Null許容）
	    private String s_B1Ryo;
	    /// 前々回使用量（Null許容）
	    private String s_B2Ryo;
	    /// 前々前回使用量（Null許容）
	    private String s_B3Ryo;
	    /// 前年同回使用量（Null許容）
	    private String s_BB1Ryo;
	    /// 前年前回使用量（Null許容）
	    private String s_BB2Ryo;
	    /// 前年前々回使用量（Null許容）
	    private String s_BB3Ryo;
	    /// 前回検針年月日（Null許容）
	    private String s_B1Date;
	    /// 前々回検針年月日（Null許容）
	    private String s_B2Date;
	    /// 前々前回検針年月日（Null許容）
	    private String s_B3Date;
	    /// 前年同回検針年月日（Null許容）
	    private String s_BB1Date;
	    /// 前年前回検針年月日（Null許容）
	    private String s_BB2Date;
	    /// 前年前々回検針検針年月日（Null許容）
	    private String s_BB3Date;
	    /// 前回使用日数（Null許容）
	    private String s_B1Kikan;
	    /// 前々回使用日数（Null許容）
	    private String s_B2Kikan;
	    /// 前々前回使用日数（Null許容）
	    private String s_B3Kikan;
	    /// 前年同回使用日数（Null許容）
	    private String s_BB1Kikan;
	    /// 前年前回使用日数（Null許容）
	    private String s_BB2Kikan;
	    /// 前年前々回使用日数（Null許容）
	    private String s_BB3Kikan;
	    /// 前回検針実施状況コード（Null許容）
	    private String s_B1JokyoCd;
	    /// 前々回検針実施状況コード（Null許容）
	    private String s_B2JokyoCd;
	    /// 前々前回検針実施状況コード（Null許容）
	    private String s_B3JokyoCd;
	    /// 前年同回検針実施状況コード（Null許容）
	    private String s_BB1JokyoCd;
	    /// 前年前回検針実施状況コード（Null許容）
	    private String s_BB2JokyoCd;
	    /// 前年前々回検針実施状況コード（Null許容）
	    private String s_BB3JokyoCd;
	    /// 試験針（Null許容）
	    private String s_Sikenbari;
	    /// 前回試験針（Null許容）
	    private String s_B1Sikenbari;
	    /// 前々回試験針（Null許容）
	    private String s_B2Sikenbari;
	    /// 今回連続０事由（Null許容）
	    private String s_RenzokuZeroJiyu;
	    /// 前回連続０事由（Null許容）
	    private String s_B1RenzokuZeroJiyu;
	    /// 前々回連続０事由（Null許容）
	    private String s_B2RenzokuZeroJiyu;
	    /// 前回検針結果作成事由（Null許容）
	    private String s_B1JiyuCd;
	    /// 前々回検針結果作成事由（Null許容）
	    private String s_B2JiyuCd;
	    /// 前年同回検針結果作成事由（Null許容）
	    private String s_BB1JiyuCd;
	    /// 前年前回検針結果作成事由（Null許容）
	    private String s_BB2JiyuCd;
	    /// 検針区分コード
	    private String s_DivisionCd;
	    /// 検針予定日
	    @Column(name = "s_ScheduledDate", nullable = false)
	    private String sScheduledDate;
	    /// デマンドコード
	    private String s_DemandCd;
	    ///　接客分類コード01（不在）
	    private String s_KyakuBunCd01;
	    ///　接客手入力内容01（不在）
	    private String  s_KyakuNaiyo01;
	    ///　接客分類コード02（異常使用量）
	    private String s_KyakuBunCd02;
	    ///　接客手入力内容02（異常使用量）
	    private String s_KyakuNaiyo02;
	    ///　接客分類コード03（マイコン点滅）
	    private String s_KyakuBunCd03;
	    ///　接客手入力内容03（マイコン点滅）
	    private String s_KyakuNaiyo03;
	    ///　接客分類コード04（メータ扉）
	    private String s_KyakuBunCd04;
	    ///　接客手入力内容04（メータ扉）
	    private String s_KyakuNaiyo04;
	    ///　接客分類コード05（自動検針配布）
	    private String s_KyakuBunCd05;
	    ///　接客手入力内容05（自動検針配布）
	    private String s_KyakuNaiyo05;
	    ///　接客分類コード06（メータ不動）
	    private String s_KyakuBunCd06;
	    ///　接客手入力内容06（メータ不動）
	    private String s_KyakuNaiyo06;
	    ///　接客分類コード07（不明）
	    private String s_KyakuBunCd07;
	    ///　接客手入力内容07（不明）
	    private String s_KyakuNaiyo07;
	    ///　接客分類コード08（保留）
	    private String s_KyakuBunCd08;
	    ///　接客手入力内容08（保留）
	    private String s_KyakuNaiyo08;
	    ///　特殊情報　０(即翌再区分)
	    private String s_Tokuryo0;
	    ///　特殊情報　２(異動)
	    private String s_Tokuryo2;
	    ///　特殊情報　３(回帰)
	    private String s_Tokuryo3;
	    ///　特殊情報　4(連続０確認)
	    private String s_Tokuryo4;
	    ///　特殊情報　６(メ取)
	    private String s_Tokuryo6;
	    ///　特殊情報　７(氏名無)
	    private String s_Tokuryo7;
	    ///　特殊情報１４(負荷記録計報告)
	    private String s_Tokuryo14;
	    ///　屋内犬数
	    private String s_Idog;
	    ///　屋外犬数
	    private String s_Odog;
	    ///　屋内犬分類コード
	    private String s_IDogCd;
	    ///　屋外犬分類コード
	    private String s_ODogCd;
//		public String getS_customer_id() {
//			return s_customer_id;
//		}
//		public void setS_customer_id(String s_customer_id) {
//			this.s_customer_id = s_customer_id;
//		}
		public String getS_MeterNo() {
			return s_MeterNo;
		}
		public void setS_MeterNo(String s_MeterNo) {
			this.s_MeterNo = s_MeterNo;
		}
		public String getS_SokuDate() {
			return s_SokuDate;
		}
		public void setS_SokuDate(String s_SokuDate) {
			this.s_SokuDate = s_SokuDate;
		}
		public String getS_GasSecchi() {
			return s_GasSecchi;
		}
		public void setS_GasSecchi(String s_GasSecchi) {
			this.s_GasSecchi = s_GasSecchi;
		}
		public String getS_KenSeq() {
			return s_KenSeq;
		}
		public void setS_KenSeq(String s_KenSeq) {
			this.s_KenSeq = s_KenSeq;
		}
		public String getS_GyoseiCd() {
			return s_GyoseiCd;
		}
		public void setS_GyoseiCd(String s_GyoseiCd) {
			this.s_GyoseiCd = s_GyoseiCd;
		}
		public String getS_GouBan() {
			return s_GouBan;
		}
		public void setS_GouBan(String s_GouBan) {
			this.s_GouBan = s_GouBan;
		}
		public String getS_NameJ() {
			return s_NameJ;
		}
		public void setS_NameJ(String s_NameJ) {
			this.s_NameJ = s_NameJ;
		}
		public String getS_NameC() {
			return s_NameC;
		}
		public void setS_NameC(String s_NameC) {
			this.s_NameC = s_NameC;
		}
		public String getS_MachiJ() {
			return s_MachiJ;
		}
		public void setS_MachiJ(String s_MachiJ) {
			this.s_MachiJ = s_MachiJ;
		}
		public String getS_Adrs1() {
			return s_Adrs1;
		}
		public void setS_Adrs1(String s_Adrs1) {
			this.s_Adrs1 = s_Adrs1;
		}
		public String getS_Adrs2() {
			return s_Adrs2;
		}
		public void setS_Adrs2(String s_Adrs2) {
			this.s_Adrs2 = s_Adrs2;
		}
		public String getS_Adrs3() {
			return s_Adrs3;
		}
		public void setS_Adrs3(String s_Adrs3) {
			this.s_Adrs3 = s_Adrs3;
		}
		public String getS_TatemoN() {
			return s_TatemoN;
		}
		public void setS_TatemoN(String s_TatemoN) {
			this.s_TatemoN = s_TatemoN;
		}
		public String getS_AptJ() {
			return s_AptJ;
		}
		public void setS_AptJ(String s_AptJ) {
			this.s_AptJ = s_AptJ;
		}
		public String getS_AptMeiC2() {
			return s_AptMeiC2;
		}
		public void setS_AptMeiC2(String s_AptMeiC2) {
			this.s_AptMeiC2 = s_AptMeiC2;
		}
		public String getS_AptMeiC3() {
			return s_AptMeiC3;
		}
		public void setS_AptMeiC3(String s_AptMeiC3) {
			this.s_AptMeiC3 = s_AptMeiC3;
		}
		public String getS_YagoJ() {
			return s_YagoJ;
		}
		public void setS_YagoJ(String s_YagoJ) {
			this.s_YagoJ = s_YagoJ;
		}
		public String getS_HohoCd() {
			return s_HohoCd;
		}
		public void setS_HohoCd(String s_HohoCd) {
			this.s_HohoCd = s_HohoCd;
		}
		public String getS_MusenFlg() {
			return s_MusenFlg;
		}
		public void setS_MusenFlg(String s_MusenFlg) {
			this.s_MusenFlg = s_MusenFlg;
		}
		public String getS_JiErrCd() {
			return s_JiErrCd;
		}
		public void setS_JiErrCd(String s_JiErrCd) {
			this.s_JiErrCd = s_JiErrCd;
		}
		public String getS_JiHaifuCd() {
			return s_JiHaifuCd;
		}
		public void setS_JiHaifuCd(String s_JiHaifuCd) {
			this.s_JiHaifuCd = s_JiHaifuCd;
		}
		public String getS_UseCd() {
			return s_UseCd;
		}
		public void setS_UseCd(String s_UseCd) {
			this.s_UseCd = s_UseCd;
		}
		public String getS_KeiyakuType() {
			return s_KeiyakuType;
		}
		public void setS_KeiyakuType(String s_KeiyakuType) {
			this.s_KeiyakuType = s_KeiyakuType;
		}
		public String getS_Dmrej() {
			return s_Dmrej;
		}
		public void setS_Dmrej(String s_Dmrej) {
			this.s_Dmrej = s_Dmrej;
		}
		public String getS_TorokuMix5() {
			return s_TorokuMix5;
		}
		public void setS_TorokuMix5(String s_TorokuMix5) {
			this.s_TorokuMix5 = s_TorokuMix5;
		}
		public String getS_RyuiNaiyo1() {
			return s_RyuiNaiyo1;
		}
		public void setS_RyuiNaiyo1(String s_RyuiNaiyo1) {
			this.s_RyuiNaiyo1 = s_RyuiNaiyo1;
		}
		public String getS_JuyoHmemo() {
			return s_JuyoHmemo;
		}
		public void setS_JuyoHmemo(String s_JuyoHmemo) {
			this.s_JuyoHmemo = s_JuyoHmemo;
		}
		public String getS_JuyoLmemo() {
			return s_JuyoLmemo;
		}
		public void setS_JuyoLmemo(String s_JuyoLmemo) {
			this.s_JuyoLmemo = s_JuyoLmemo;
		}
		public String getS_IchiCd() {
			return s_IchiCd;
		}
		public void setS_IchiCd(String s_IchiCd) {
			this.s_IchiCd = s_IchiCd;
		}
		public String getS_MichiCd() {
			return s_MichiCd;
		}
		public void setS_MichiCd(String s_MichiCd) {
			this.s_MichiCd = s_MichiCd;
		}
		public String getS_PossStart() {
			return s_PossStart;
		}
		public void setS_PossStart(String s_PossStart) {
			this.s_PossStart = s_PossStart;
		}
		public String getS_PossEnd() {
			return s_PossEnd;
		}
		public void setS_PossEnd(String s_PossEnd) {
			this.s_PossEnd = s_PossEnd;
		}
		public String getS_PossWeek() {
			return s_PossWeek;
		}
		public void setS_PossWeek(String s_PossWeek) {
			this.s_PossWeek = s_PossWeek;
		}
		public String getS_PrevChr() {
			return s_PrevChr;
		}
		public void setS_PrevChr(String s_PrevChr) {
			this.s_PrevChr = s_PrevChr;
		}
		public String getS_LockNo() {
			return s_LockNo;
		}
		public void setS_LockNo(String s_LockNo) {
			this.s_LockNo = s_LockNo;
		}
		public String getS_AftrChr() {
			return s_AftrChr;
		}
		public void setS_AftrChr(String s_AftrChr) {
			this.s_AftrChr = s_AftrChr;
		}
		public String getS_Man() {
			return s_Man;
		}
		public void setS_Man(String s_Man) {
			this.s_Man = s_Man;
		}
		public String getS_JokyoCd() {
			return s_JokyoCd;
		}
		public void setS_JokyoCd(String s_JokyoCd) {
			this.s_JokyoCd = s_JokyoCd;
		}
		public String getS_CompCd() {
			return s_CompCd;
		}
		public void setS_CompCd(String s_CompCd) {
			this.s_CompCd = s_CompCd;
		}
		public String getS_MeterGou() {
			return s_MeterGou;
		}
		public void setS_MeterGou(String s_MeterGou) {
			this.s_MeterGou = s_MeterGou;
		}
		public String getS_MeterKata() {
			return s_MeterKata;
		}
		public void setS_MeterKata(String s_MeterKata) {
			this.s_MeterKata = s_MeterKata;
		}
		public String getS_MeterKeta() {
			return s_MeterKeta;
		}
		public void setS_MeterKeta(String s_MeterKeta) {
			this.s_MeterKeta = s_MeterKeta;
		}
		public String getS_MinShiji() {
			return s_MinShiji;
		}
		public void setS_MinShiji(String s_MinShiji) {
			this.s_MinShiji = s_MinShiji;
		}
		public String getS_OldShiji() {
			return s_OldShiji;
		}
		public void setS_OldShiji(String s_OldShiji) {
			this.s_OldShiji = s_OldShiji;
		}
		public String getS_Shiji() {
			return s_Shiji;
		}
		public void setS_Shiji(String s_Shiji) {
			this.s_Shiji = s_Shiji;
		}
		public String getS_ShiyouRyo() {
			return s_ShiyouRyo;
		}
		public void setS_ShiyouRyo(String s_ShiyouRyo) {
			this.s_ShiyouRyo = s_ShiyouRyo;
		}
		public String getS_HazusiSijisu() {
			return s_HazusiSijisu;
		}
		public void setS_HazusiSijisu(String s_HazusiSijisu) {
			this.s_HazusiSijisu = s_HazusiSijisu;
		}
		public String getS_TsukeSijisu() {
			return s_TsukeSijisu;
		}
		public void setS_TsukeSijisu(String s_TsukeSijisu) {
			this.s_TsukeSijisu = s_TsukeSijisu;
		}
		public String getS_KyakuShiji() {
			return s_KyakuShiji;
		}
		public void setS_KyakuShiji(String s_KyakuShiji) {
			this.s_KyakuShiji = s_KyakuShiji;
		}
		public String getS_KyakuDate() {
			return s_KyakuDate;
		}
		public void setS_KyakuDate(String s_KyakuDate) {
			this.s_KyakuDate = s_KyakuDate;
		}
		public String getS_B1Ryo() {
			return s_B1Ryo;
		}
		public void setS_B1Ryo(String s_B1Ryo) {
			this.s_B1Ryo = s_B1Ryo;
		}
		public String getS_B2Ryo() {
			return s_B2Ryo;
		}
		public void setS_B2Ryo(String s_B2Ryo) {
			this.s_B2Ryo = s_B2Ryo;
		}
		public String getS_B3Ryo() {
			return s_B3Ryo;
		}
		public void setS_B3Ryo(String s_B3Ryo) {
			this.s_B3Ryo = s_B3Ryo;
		}
		public String getS_BB1Ryo() {
			return s_BB1Ryo;
		}
		public void setS_BB1Ryo(String s_BB1Ryo) {
			this.s_BB1Ryo = s_BB1Ryo;
		}
		public String getS_BB2Ryo() {
			return s_BB2Ryo;
		}
		public void setS_BB2Ryo(String s_BB2Ryo) {
			this.s_BB2Ryo = s_BB2Ryo;
		}
		public String getS_BB3Ryo() {
			return s_BB3Ryo;
		}
		public void setS_BB3Ryo(String s_BB3Ryo) {
			this.s_BB3Ryo = s_BB3Ryo;
		}
		public String getS_B1Date() {
			return s_B1Date;
		}
		public void setS_B1Date(String s_B1Date) {
			this.s_B1Date = s_B1Date;
		}
		public String getS_B2Date() {
			return s_B2Date;
		}
		public void setS_B2Date(String s_B2Date) {
			this.s_B2Date = s_B2Date;
		}
		public String getS_B3Date() {
			return s_B3Date;
		}
		public void setS_B3Date(String s_B3Date) {
			this.s_B3Date = s_B3Date;
		}
		public String getS_BB1Date() {
			return s_BB1Date;
		}
		public void setS_BB1Date(String s_BB1Date) {
			this.s_BB1Date = s_BB1Date;
		}
		public String getS_BB2Date() {
			return s_BB2Date;
		}
		public void setS_BB2Date(String s_BB2Date) {
			this.s_BB2Date = s_BB2Date;
		}
		public String getS_BB3Date() {
			return s_BB3Date;
		}
		public void setS_BB3Date(String s_BB3Date) {
			this.s_BB3Date = s_BB3Date;
		}
		public String getS_B1Kikan() {
			return s_B1Kikan;
		}
		public void setS_B1Kikan(String s_B1Kikan) {
			this.s_B1Kikan = s_B1Kikan;
		}
		public String getS_B2Kikan() {
			return s_B2Kikan;
		}
		public void setS_B2Kikan(String s_B2Kikan) {
			this.s_B2Kikan = s_B2Kikan;
		}
		public String getS_B3Kikan() {
			return s_B3Kikan;
		}
		public void setS_B3Kikan(String s_B3Kikan) {
			this.s_B3Kikan = s_B3Kikan;
		}
		public String getS_BB1Kikan() {
			return s_BB1Kikan;
		}
		public void setS_BB1Kikan(String s_BB1Kikan) {
			this.s_BB1Kikan = s_BB1Kikan;
		}
		public String getS_BB2Kikan() {
			return s_BB2Kikan;
		}
		public void setS_BB2Kikan(String s_BB2Kikan) {
			this.s_BB2Kikan = s_BB2Kikan;
		}
		public String getS_BB3Kikan() {
			return s_BB3Kikan;
		}
		public void setS_BB3Kikan(String s_BB3Kikan) {
			this.s_BB3Kikan = s_BB3Kikan;
		}
		public String getS_B1JokyoCd() {
			return s_B1JokyoCd;
		}
		public void setS_B1JokyoCd(String s_B1JokyoCd) {
			this.s_B1JokyoCd = s_B1JokyoCd;
		}
		public String getS_B2JokyoCd() {
			return s_B2JokyoCd;
		}
		public void setS_B2JokyoCd(String s_B2JokyoCd) {
			this.s_B2JokyoCd = s_B2JokyoCd;
		}
		public String getS_B3JokyoCd() {
			return s_B3JokyoCd;
		}
		public void setS_B3JokyoCd(String s_B3JokyoCd) {
			this.s_B3JokyoCd = s_B3JokyoCd;
		}
		public String getS_BB1JokyoCd() {
			return s_BB1JokyoCd;
		}
		public void setS_BB1JokyoCd(String s_BB1JokyoCd) {
			this.s_BB1JokyoCd = s_BB1JokyoCd;
		}
		public String getS_BB2JokyoCd() {
			return s_BB2JokyoCd;
		}
		public void setS_BB2JokyoCd(String s_BB2JokyoCd) {
			this.s_BB2JokyoCd = s_BB2JokyoCd;
		}
		public String getS_BB3JokyoCd() {
			return s_BB3JokyoCd;
		}
		public void setS_BB3JokyoCd(String s_BB3JokyoCd) {
			this.s_BB3JokyoCd = s_BB3JokyoCd;
		}
		public String getS_Sikenbari() {
			return s_Sikenbari;
		}
		public void setS_Sikenbari(String s_Sikenbari) {
			this.s_Sikenbari = s_Sikenbari;
		}
		public String getS_B1Sikenbari() {
			return s_B1Sikenbari;
		}
		public void setS_B1Sikenbari(String s_B1Sikenbari) {
			this.s_B1Sikenbari = s_B1Sikenbari;
		}
		public String getS_B2Sikenbari() {
			return s_B2Sikenbari;
		}
		public void setS_B2Sikenbari(String s_B2Sikenbari) {
			this.s_B2Sikenbari = s_B2Sikenbari;
		}
		public String getS_RenzokuZeroJiyu() {
			return s_RenzokuZeroJiyu;
		}
		public void setS_RenzokuZeroJiyu(String s_RenzokuZeroJiyu) {
			this.s_RenzokuZeroJiyu = s_RenzokuZeroJiyu;
		}
		public String getS_B1RenzokuZeroJiyu() {
			return s_B1RenzokuZeroJiyu;
		}
		public void setS_B1RenzokuZeroJiyu(String s_B1RenzokuZeroJiyu) {
			this.s_B1RenzokuZeroJiyu = s_B1RenzokuZeroJiyu;
		}
		public String getS_B2RenzokuZeroJiyu() {
			return s_B2RenzokuZeroJiyu;
		}
		public void setS_B2RenzokuZeroJiyu(String s_B2RenzokuZeroJiyu) {
			this.s_B2RenzokuZeroJiyu = s_B2RenzokuZeroJiyu;
		}
		public String getS_B1JiyuCd() {
			return s_B1JiyuCd;
		}
		public void setS_B1JiyuCd(String s_B1JiyuCd) {
			this.s_B1JiyuCd = s_B1JiyuCd;
		}
		public String getS_B2JiyuCd() {
			return s_B2JiyuCd;
		}
		public void setS_B2JiyuCd(String s_B2JiyuCd) {
			this.s_B2JiyuCd = s_B2JiyuCd;
		}
		public String getS_BB1JiyuCd() {
			return s_BB1JiyuCd;
		}
		public void setS_BB1JiyuCd(String s_BB1JiyuCd) {
			this.s_BB1JiyuCd = s_BB1JiyuCd;
		}
		public String getS_BB2JiyuCd() {
			return s_BB2JiyuCd;
		}
		public void setS_BB2JiyuCd(String s_BB2JiyuCd) {
			this.s_BB2JiyuCd = s_BB2JiyuCd;
		}
		public String getS_DivisionCd() {
			return s_DivisionCd;
		}
		public void setS_DivisionCd(String s_DivisionCd) {
			this.s_DivisionCd = s_DivisionCd;
		}
		public String getS_ScheduledDate() {
			return sScheduledDate;
		}
		public void setS_ScheduledDate(String s_ScheduledDate) {
			this.sScheduledDate = s_ScheduledDate;
		}
		public String getS_DemandCd() {
			return s_DemandCd;
		}
		public void setS_DemandCd(String s_DemandCd) {
			this.s_DemandCd = s_DemandCd;
		}
		public String getS_KyakuBunCd01() {
			return s_KyakuBunCd01;
		}
		public void setS_KyakuBunCd01(String s_KyakuBunCd01) {
			this.s_KyakuBunCd01 = s_KyakuBunCd01;
		}
		public String getS_KyakuNaiyo01() {
			return s_KyakuNaiyo01;
		}
		public void setS_KyakuNaiyo01(String s_KyakuNaiyo01) {
			this.s_KyakuNaiyo01 = s_KyakuNaiyo01;
		}
		public String getS_KyakuBunCd02() {
			return s_KyakuBunCd02;
		}
		public void setS_KyakuBunCd02(String s_KyakuBunCd02) {
			this.s_KyakuBunCd02 = s_KyakuBunCd02;
		}
		public String getS_KyakuNaiyo02() {
			return s_KyakuNaiyo02;
		}
		public void setS_KyakuNaiyo02(String s_KyakuNaiyo02) {
			this.s_KyakuNaiyo02 = s_KyakuNaiyo02;
		}
		public String getS_KyakuBunCd03() {
			return s_KyakuBunCd03;
		}
		public void setS_KyakuBunCd03(String s_KyakuBunCd03) {
			this.s_KyakuBunCd03 = s_KyakuBunCd03;
		}
		public String getS_KyakuNaiyo03() {
			return s_KyakuNaiyo03;
		}
		public void setS_KyakuNaiyo03(String s_KyakuNaiyo03) {
			this.s_KyakuNaiyo03 = s_KyakuNaiyo03;
		}
		public String getS_KyakuBunCd04() {
			return s_KyakuBunCd04;
		}
		public void setS_KyakuBunCd04(String s_KyakuBunCd04) {
			this.s_KyakuBunCd04 = s_KyakuBunCd04;
		}
		public String getS_KyakuNaiyo04() {
			return s_KyakuNaiyo04;
		}
		public void setS_KyakuNaiyo04(String s_KyakuNaiyo04) {
			this.s_KyakuNaiyo04 = s_KyakuNaiyo04;
		}
		public String getS_KyakuBunCd05() {
			return s_KyakuBunCd05;
		}
		public void setS_KyakuBunCd05(String s_KyakuBunCd05) {
			this.s_KyakuBunCd05 = s_KyakuBunCd05;
		}
		public String getS_KyakuNaiyo05() {
			return s_KyakuNaiyo05;
		}
		public void setS_KyakuNaiyo05(String s_KyakuNaiyo05) {
			this.s_KyakuNaiyo05 = s_KyakuNaiyo05;
		}
		public String getS_KyakuBunCd06() {
			return s_KyakuBunCd06;
		}
		public void setS_KyakuBunCd06(String s_KyakuBunCd06) {
			this.s_KyakuBunCd06 = s_KyakuBunCd06;
		}
		public String getS_KyakuNaiyo06() {
			return s_KyakuNaiyo06;
		}
		public void setS_KyakuNaiyo06(String s_KyakuNaiyo06) {
			this.s_KyakuNaiyo06 = s_KyakuNaiyo06;
		}
		public String getS_KyakuBunCd07() {
			return s_KyakuBunCd07;
		}
		public void setS_KyakuBunCd07(String s_KyakuBunCd07) {
			this.s_KyakuBunCd07 = s_KyakuBunCd07;
		}
		public String getS_KyakuNaiyo07() {
			return s_KyakuNaiyo07;
		}
		public void setS_KyakuNaiyo07(String s_KyakuNaiyo07) {
			this.s_KyakuNaiyo07 = s_KyakuNaiyo07;
		}
		public String getS_KyakuBunCd08() {
			return s_KyakuBunCd08;
		}
		public void setS_KyakuBunCd08(String s_KyakuBunCd08) {
			this.s_KyakuBunCd08 = s_KyakuBunCd08;
		}
		public String getS_KyakuNaiyo08() {
			return s_KyakuNaiyo08;
		}
		public void setS_KyakuNaiyo08(String s_KyakuNaiyo08) {
			this.s_KyakuNaiyo08 = s_KyakuNaiyo08;
		}
		public String getS_Tokuryo0() {
			return s_Tokuryo0;
		}
		public void setS_Tokuryo0(String s_Tokuryo0) {
			this.s_Tokuryo0 = s_Tokuryo0;
		}
		public String getS_Tokuryo2() {
			return s_Tokuryo2;
		}
		public void setS_Tokuryo2(String s_Tokuryo2) {
			this.s_Tokuryo2 = s_Tokuryo2;
		}
		public String getS_Tokuryo3() {
			return s_Tokuryo3;
		}
		public void setS_Tokuryo3(String s_Tokuryo3) {
			this.s_Tokuryo3 = s_Tokuryo3;
		}
		public String getS_Tokuryo4() {
			return s_Tokuryo4;
		}
		public void setS_Tokuryo4(String s_Tokuryo4) {
			this.s_Tokuryo4 = s_Tokuryo4;
		}
		public String getS_Tokuryo6() {
			return s_Tokuryo6;
		}
		public void setS_Tokuryo6(String s_Tokuryo6) {
			this.s_Tokuryo6 = s_Tokuryo6;
		}
		public String getS_Tokuryo7() {
			return s_Tokuryo7;
		}
		public void setS_Tokuryo7(String s_Tokuryo7) {
			this.s_Tokuryo7 = s_Tokuryo7;
		}
		public String getS_Tokuryo14() {
			return s_Tokuryo14;
		}
		public void setS_Tokuryo14(String s_Tokuryo14) {
			this.s_Tokuryo14 = s_Tokuryo14;
		}
		public String getS_Idog() {
			return s_Idog;
		}
		public void setS_Idog(String s_Idog) {
			this.s_Idog = s_Idog;
		}
		public String getS_Odog() {
			return s_Odog;
		}
		public void setS_Odog(String s_Odog) {
			this.s_Odog = s_Odog;
		}
		public String getS_IDogCd() {
			return s_IDogCd;
		}
		public void setS_IDogCd(String s_IDogCd) {
			this.s_IDogCd = s_IDogCd;
		}
		public String getS_ODogCd() {
			return s_ODogCd;
		}
		public void setS_ODogCd(String s_ODogCd) {
			this.s_ODogCd = s_ODogCd;
		}
}