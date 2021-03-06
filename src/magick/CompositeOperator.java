package magick;

public interface CompositeOperator {
	/*
		Important! Constant values should correspond to:
		http://trac.imagemagick.org/browser/ImageMagick/branches/ImageMagick-6.6.9/magick/composite.h
	*/

	public static final int UndefinedCompositeOp = 0;
	public static final int NoCompositeOp = 1;
	public static final int ModulusAddCompositeOp = 2;
	@Deprecated
	public static final int AddCompositeOp = 2;
	public static final int AtopCompositeOp = 3;
	public static final int BlendCompositeOp = 4;
	public static final int BumpmapCompositeOp = 5;
	public static final int ChangeMaskCompositeOp = 6;
	public static final int ClearCompositeOp = 7;
	public static final int ColorBurnCompositeOp = 8;
	public static final int ColorDodgeCompositeOp = 9;
	public static final int ColorizeCompositeOp = 10;
	public static final int CopyBlackCompositeOp = 11;
	public static final int CopyBlueCompositeOp = 12;
	public static final int CopyCompositeOp = 13;
	public static final int CopyCyanCompositeOp = 14;
	public static final int CopyGreenCompositeOp = 15;
	public static final int CopyMagentaCompositeOp = 16;
	public static final int CopyOpacityCompositeOp = 17;
	public static final int CopyRedCompositeOp = 18;
	public static final int CopyYellowCompositeOp = 19;
	public static final int DarkenCompositeOp = 20;
	public static final int DstAtopCompositeOp = 21;
	public static final int DstCompositeOp = 22;
	public static final int DstInCompositeOp = 23;
	public static final int DstOutCompositeOp = 24;
	public static final int DstOverCompositeOp = 25;
	public static final int DifferenceCompositeOp = 26;
	public static final int DisplaceCompositeOp = 27;
	public static final int DissolveCompositeOp = 28;
	public static final int ExclusionCompositeOp = 29;
	public static final int HardLightCompositeOp = 30;
	public static final int HueCompositeOp = 31;
	public static final int InCompositeOp = 32;
	public static final int LightenCompositeOp = 33;
	public static final int LinearLightCompositeOp = 34;
	public static final int LuminizeCompositeOp = 35;
	public static final int MinusDstCompositeOp = 36;
	@Deprecated
	public static final int MinusCompositeOp = 36;
	public static final int ModulateCompositeOp = 37;
	public static final int MultiplyCompositeOp = 38;
	public static final int OutCompositeOp = 39;
	public static final int OverCompositeOp = 40;
	public static final int OverlayCompositeOp = 41;
	public static final int PlusCompositeOp = 42;
	public static final int ReplaceCompositeOp = 43;
	public static final int SaturateCompositeOp = 44;
	public static final int ScreenCompositeOp = 45;
	public static final int SoftLightCompositeOp = 46;
	public static final int SrcAtopCompositeOp = 47;
	public static final int SrcCompositeOp = 48;
	public static final int SrcInCompositeOp = 49;
	public static final int SrcOutCompositeOp = 50;
	public static final int SrcOverCompositeOp = 51;
	public static final int ModulusSubtractCompositeOp = 52;
	@Deprecated
	public static final int SubtractCompositeOp = 52;
	public static final int ThresholdCompositeOp = 53;
	public static final int XorCompositeOp = 54;
	public static final int DivideDstCompositeOp = 55;
	@Deprecated
	public static final int DivideCompositeOp = 55;
	
    // The following have been added after ImageMagick-6.4.1-2 and before 6.5.7-6
    // (exact time not known). Using them is untested.
	public static final int DistortCompositeOp = 56;
	public static final int BlurCompositeOp = 57;
	public static final int PegtopLightCompositeOp = 58;
	public static final int VividLightCompositeOp = 59;
	public static final int PinLightCompositeOp = 60;
	public static final int LinearDodgeCompositeOp = 61;
	public static final int LinearBurnCompositeOp = 62;
	public static final int MathematicsCompositeOp = 63;

	// Added in IM 6.6.8 
	public static final int DivideSrcCompositeOp = 64;
	public static final int MinusSrcCompositeOp = 65;

	// Added in IM 6.6.9
	public static final int DarkenIntensityCompositeOp = 66;
	public static final int LightenIntensityCompositeOp = 67;
}
